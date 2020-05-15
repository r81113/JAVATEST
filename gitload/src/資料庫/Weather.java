package 資料庫;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Weather {

	static Connection conn = null;

	public static void main(String[] args)
			throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Document html = getdoc();

		data(html);

		select();

	}

	public static void select() throws SQLException {

		while (true) {

			Scanner input = new Scanner(System.in);

			System.out.print("請輸入縣市名:");

			String a = input.next();

			String select = "SELECT * FROM data WHERE country LIKE '%" + a + "%'";

			PreparedStatement s = conn.prepareStatement(select);

			ResultSet rs = s.executeQuery();

			while (rs.next()) {

				String country = rs.getString(2);

				String tmp = rs.getString(3);

				System.out.println(country + "\t" + tmp);

			}

			rs.close();
		}

	}

	public static void data(Document html)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		data_table();

		String insert = "INSERT INTO data (country,tmp) Values(?,?)";

		PreparedStatement ps = conn.prepareStatement(insert);

		for (Element row : html.select(
				"html body div.wrapper main.main-content.container div.row div.col-md-8 div#theme-1.map_theme.full_map div.weather_data a.icon_zone")) {

			String s = row.select("p.city").text();

			String c = row.select("span.tem-C.is-active").text();

			System.out.println(s + "\t" + c);

			ps.setString(1, s);

			ps.setString(2, c);

			ps.execute();

		}

	}

//	public static void extracted() throws SQLException {
//		String update = "UPDATE data SET country = ?, tmp = ? WHERE id = ?";
//
//		PreparedStatement s = conn.prepareStatement(update);
//
//		s.setString(1, "美國");
//
//		s.setString(2, "100");
//
//		s.setInt(3, 1);
//
//		s.executeUpdate();
//
//		s.close();
//	}

	public static void data_table()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf-8", "root", "");

		Statement st = conn.createStatement();

		st.execute("CREATE DATABASE IF NOT EXISTS weather");

		st.execute("USE weather");

		st.execute("DROP TABLE IF EXISTS data");

		st.execute(
				"CREATE TABLE IF NOT EXISTS data(ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,country varchar(50),tmp varchar(50))");

	}

	public static Document getdoc() throws IOException {
		// TODO Auto-generated method stub
		WebClient web = new WebClient();
		web.getOptions().setUseInsecureSSL(true);
		web.getOptions().setJavaScriptEnabled(true);
		web.getOptions().setThrowExceptionOnScriptError(false);
		web.getOptions().setThrowExceptionOnFailingStatusCode(false);
		web.getOptions().setDoNotTrackEnabled(false);
		web.getOptions().setActiveXNative(false);
		web.getOptions().setCssEnabled(false);
		web.setAjaxController(new NicelyResynchronizingAjaxController());
		web.waitForBackgroundJavaScript(600 * 1000);
		WebRequest request = new WebRequest(new URL("https://www.cwb.gov.tw/V8/C/W/County/"));

		try {

			HtmlPage page = web.getPage(request);

			String tmp = page.asXml();

			return Jsoup.parse(tmp);

		} catch (FailingHttpStatusCodeException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {

		} finally {
			web.close();
		}
		return null;
	}

}

package 資料庫;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NBA {
	static ArrayList<String> b = new ArrayList();

	static int id = 0;

	static String name = "";

	public static void main(String args[])
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

		Document document = Jsoup.connect("https://basketball.realgm.com/nba/hall-of-fame").get();

		status(document);

		database();

	}

	public static void database()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Connection conn = null;

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?characterEncoding=utf-8", "root", "");

		Statement st = conn.createStatement();

		st.execute("CREATE DATABASE IF NOT EXISTS test");

		st.execute("USE test");

		st.execute("DROP TABLE IF EXISTS p");

		st.execute("CREATE TABLE IF NOT EXISTS p(id INTEGER not NULL,name varchar(50))");

		String insert = "INSERT INTO p VALUES(?,?)";

		PreparedStatement ps = conn.prepareStatement(insert);

		for (int i = 0; i < b.size(); i++) {

			ps.setInt(1, i + 1);

			ps.setString(2, b.get(i));

			ps.execute();

		}

		while (true) {
			
			Scanner input = new Scanner(System.in);

			System.out.print("請輸入名字:");

			String a = input.next();

			String select = "SELECT * FROM p WHERE name LIKE '%" + a + "%'";

			PreparedStatement s = conn.prepareStatement(select);

			ResultSet rs = s.executeQuery();

			while (rs.next()) {

				id = rs.getInt(1);

				name = rs.getString(2);

				System.out.println(id + "." + name);

			}

			rs.close();
		}

	}

	public static void status(Document document) {

		int tmp = 0;

		for (Element row : document
				.select("html body div#site-takeover div.main-container div.main.wrapper.clearfix.container")
				.select("div.retired-jersey.clearfix span.player-name a")) {

			String s = row.text();

			b.add(s);

			tmp = tmp + 1;

		}

	}
}

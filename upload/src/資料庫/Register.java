package 資料庫;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {

	static Connection conn = null;

	static String name;

	static String gender = "";

	static int choose;

	static int age;

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mysql?characterEncoding=utf-8&serverTimezone=CST&useSSL=true", "root", "");

		Statement st = conn.createStatement();

		st.execute("CREATE DATABASE IF NOT EXISTS register");

		st.execute("USE register");

		st.execute(
				"CREATE TABLE IF NOT EXISTS data( id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,name varchar(50),gender varchar(50),age int(50))");

		st.execute("ALTER TABLE data AUTO_INCREMENT = 1;");

		System.out.print("請輸入姓名:");

		name = input.next();

		System.out.print("請輸入性別:");

		choose = input.nextInt();

		while (true) {

			if (choose == 1) {

				gender = "male";
				break;
			} else if (choose == 2) {

				gender = "female";
				break;
			} else {

				System.out.println("重新輸入1=male 2=female");

				System.out.print("請輸入性別:");

				choose = input.nextInt();

			}
		}

		System.out.print("請輸入年齡:");

		age = input.nextInt();

		String select = "SELECT name FROM data";

		PreparedStatement s = conn.prepareStatement(select);

		ResultSet rs = s.executeQuery();

		String tmpName = "";

		while (rs.next()) {

			tmpName = rs.getString("name");

			if (tmpName.contentEquals(name)) {

				String delete = "delete from data where id not in (select id from (select a.id from data a join data b on a.name = b.name group by a.name) c)";

				PreparedStatement ps2 = conn.prepareStatement(delete);

				ps2 = conn.prepareStatement(delete);

				ps2.execute();

				System.out.println("重複!!");

				System.exit(0);

			} 

		}

		String insert = "INSERT INTO data (name,gender,age) VALUES(?,?,?)";

		PreparedStatement ps = conn.prepareStatement(insert);

		ps.setString(1, name);

		ps.setString(2, gender);

		ps.setInt(3, age);

		ps.execute();

		System.out.println("名字:" + name + "\n" + "性別:" + gender + "\n" + "年齡:" + age);

	}
}

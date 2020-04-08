package 包裝類別;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class 字串 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		byte[] x1 = { 72, 101, 108, 108, 111 };

		byte[] x1_2 = { 72, 101, 108, 108, 111 };

		char[] x2 = { 'a', 'b', 'c' };

		String str1 = new String();

		String str2 = new String(x1);

		String str3 = new String(x2);

		x2 = str3.toCharArray();

		System.out.println(x1.equals(x1_2));

		System.out.println(str2);

		System.out.println(str3);

		System.out.println(x2);

		String test = "你好!";

		String test2 = new String(test.getBytes(), "UTF-8");

		System.out.println(test2);

		System.out.println("------------------------------");

		String name1 = "abcd";

		String name2 = "abcd";

		String a = new String("abcd");

		String b = new String("abcd");

		System.out.println(name2 == name1);
		System.out.println(name1 == name2);

		System.out.println(name1 == a);
		System.out.println(name2 == a);

		System.out.println(name1 == b);
		System.out.println(name2 == b);

		System.out.println(a == b);
		System.out.println(b == a);

		System.out.println("------------------------------");

		String value = "ssds123";

		value += "sdsadaad";

		String value2 = "ssds123sdsadaad";

		String s = "123";

		s = "456";

		s = s.concat("321");

		System.out.println(value == value2);

		System.out.println(value.equals(value2));

		System.out.println(s);

		System.out.println("------------------------------");

		String y = " abcd ";

		String x = a.toUpperCase();

		System.out.println(y);

		System.out.println(y.trim());

		System.out.println(x);

		System.out.println(x.trim());

		System.out.println("------------------------------");

		String xx = "吃啥?";

		xx.concat("熱狗??");

		String xx2 = xx.concat("熱狗??");

		System.out.println(xx);// 印不出來全部!!!

		System.out.println(xx2);

		System.out.println("abc".concat("de"));

		System.out.println("------------------------------");

		System.out.println("abc".equals("abc"));

		System.out.println("f".compareTo("abc"));// 如果第一个字符和参数的第一个字符不等，结束比较，返回他们之间的差值，如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，以此类推,直至比较的字符或被比较的字符有一方结束。

		System.out.println("abc".startsWith("a"));

		System.out.println("abc".endsWith("bc"));

		System.out.println("abc".contains("c"));// 包含

		System.out.println("------------------------------");

		String password = "ab3456abc";

		System.out.println(password.indexOf("ab"));

		System.out.println(password.indexOf("ab", 2));// 數字3往後

		System.out.println(password.indexOf("aaa"));

		System.out.println("------------------------------");

		System.out.println("請輸入用戶名:");

		String name = input.nextLine().trim();// 讀取

		System.out.println("--" + name + "--");

	}

}

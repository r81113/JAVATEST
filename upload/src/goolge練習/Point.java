package goolge練習;

import java.util.Scanner;

public class Point {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("請輸入字串:");

		String key = input.next();

		System.out.println(key.substring(1, 3));
		
		System.out.println(key.substring(3));
		
		judge2(key);

	}

	public static String judge() {

		System.out.println("請輸入數字:");

		double x = input.nextDouble();

		String s = String.valueOf(x);

		System.out.println("小數點在第" + (s.indexOf(".") + 1) + "位");

		return s;

	}

	public static boolean judge2(String str) {

		boolean judge2 = true;

		for (int i = 0; i < str.length(); i++) {

			if (!Character.isDigit(str.charAt(i))) {

				if (str.charAt(i) == '.') {

					if (i == 0 || i == str.length() - 1) {// 第一位和最後一位非法

						System.out.println("xx");

						return false;

					}

				} else {

					System.out.println("gg");

					return false;
				}

			}

		}
		// 只能有一個小數點
		if (!(str.indexOf(".") == str.lastIndexOf(".")) || !(str.contains("."))) {

			System.out.println("gggg");

			return false;
		}

		System.out.println("小數點在第" + (str.indexOf(".") + 1) + "位");

		return judge2;
	}
}

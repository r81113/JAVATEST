package 包裝類別;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isDigit = true;

		System.out.println("判斷純數字?:");

		String value = new Scanner(System.in).next();

		for (int i = 0; i < value.length(); i++) {

			if (!Character.isDigit(value.charAt(i))) {

				isDigit = false;
				break;
			}
		}

		if (!isDigit) {

			System.out.print("不是一個純數字");

		} else {

			System.out.print("是一個純數字!!");
		}

	}

}

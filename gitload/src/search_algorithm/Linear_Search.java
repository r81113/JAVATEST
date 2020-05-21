package search_algorithm;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int index = -1;

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.print("請輸入要尋找數字:");

		int key = input.nextInt();

		for (int i = 0; i < arr.length; i++) {

			if (key == arr[i]) {

				index = i;

				break;

			}

		}

		if (index != -1) {

			System.out.println("元素" + key + "的下標是" + index);

		} else {

			System.out.println("不存在此元素");
		}
	}

}

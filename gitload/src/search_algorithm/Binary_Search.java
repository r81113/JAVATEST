package search_algorithm;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int index = -1;

		System.out.print("尋找要找得數字:");

		int key = input.nextInt();

		int low = 0;// 下

		int high = arr.length - 1;// 上

		while (high >= low) {

			int mid = (high + low) / 2;

			if (key < arr[mid]) {

				high = mid - 1;
			}

			else if (key > arr[mid]) {

				low = mid + 1;

			}

			else {

				index = mid;

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

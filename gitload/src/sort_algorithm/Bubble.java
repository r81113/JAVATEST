package sort_algorithm;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 66, 5, 3, 88, 96, 4 };

		int temp;

		for (int i = 0; i < arr.length  - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if ((i + 1) % arr.length == 0) {

				System.out.print(arr[i]);

			} else {

				System.out.print(arr[i] + ",");
			}

		}

	}

}

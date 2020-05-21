package sort_algorithm;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 66, 5, 3, 88, 96, 4 };

		for (int i = 0; i < arr.length; i++) {

			int min = arr[i];

			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (min > arr[j]) {

					min = arr[j];
					minIndex = j;

				}

			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

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

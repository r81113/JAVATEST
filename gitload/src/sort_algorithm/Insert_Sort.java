package sort_algorithm;

public class Insert_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 66, 5, 3, 88, 96, 4 };

		int key;

		int j;

		for (int i = 1; i < arr.length; i++) {

			key = arr[i];

			j = i - 1;

			while ((j >= 0) && (arr[j] > key)) {

				arr[j + 1] = arr[j];

				j--;

			}

			arr[j + 1] = key;

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

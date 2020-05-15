package goolge練習;

import java.util.Scanner;

public class TwoArray_1 {

	static int a,b;

	static int[][] matrix;

	public static void main(String[] args) {

		spiralCopy();

		spiralCopy2(matrix, 0, 0, a, b);
	}

	static int[][] spiralCopy() {
		// your code goes here
		Scanner input = new Scanner(System.in);

		System.out.print("請輸入二維陣列:");

		a = input.nextInt();

		b = input.nextInt();
		
		matrix = new int[a][b];

		System.out.print("請輸入內容:");

		for (int i = 0; i < a; i++) {

			for (int j = 0; j < b; j++) {

				matrix[i][j] = input.nextInt();

			}
		}

		System.out.print("[");

		for (int i = 0; i < a; i++) {

			System.out.print("[");
			for (int j = 0; j < b; j++) {

				if (j == (b - 1)) {

					System.out.print(matrix[i][j]);

					System.out.print("]");

					break;
				}

				System.out.print(matrix[i][j] + ",");

			}
		}

		System.out.println("]");

		return matrix;
	}

	static void spiralCopy2(int arr[][], int i, int j, int m, int n) {
// If i or j lies outside the matrix 
		if (i >= m || j >= n) {
			return;
		}

// Print First Row 
		for (int p = i; p < n; p++) {
			System.out.print(arr[i][p] + " ");
		}

// Print Last Column 
		for (int p = i + 1; p < m; p++) {
			System.out.print(arr[p][n - 1] + " ");
		}

// Print Last Row, if Last and 
// First Row are not same 
		if ((m - 1) != i) {
			for (int p = n - 2; p >= j; p--) {
				System.out.print(arr[m - 1][p] + " ");
			}
		}

// Print First Column, if Last and 
// First Column are not same 
		if ((n - 1) != j) {
			for (int p = m - 2; p > i; p--) {
				System.out.print(arr[p][j] + " ");
			}
		}

		spiralCopy2(arr, i + 1, j + 1, m - 1, n - 1);
	}

}

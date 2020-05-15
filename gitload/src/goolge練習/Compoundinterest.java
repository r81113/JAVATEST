package goolge½m²ß;

public class Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		compute(3, 10000);

	}

	public static void compute(int n, int p) {

		double r = 0.001;

		double total = 0;

		double tmp = 0;

		for (int i = 0; i < n; i++) {

			if (i > 0) {

				total = (total + p) * (1 + r);

			}

			else {

				tmp = p * r;

				total = p + tmp;
			}

			System.out.println("²Ä" + (i + 1) + "­Ó¤ë:" + (int)total);

		}

	}

}

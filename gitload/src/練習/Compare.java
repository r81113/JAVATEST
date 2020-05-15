package 練習;


public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "默認戰士1";

		String b = "默認戰士3";

		String temp = null;

		String[] heroarray = { a, b

		};
		
		System.out.println(a.compareTo(b));

		
		for (int i = 0; i < heroarray.length; i++) {

			for (int j = 0; j < heroarray.length - i - 1; j++) {

				if (a.compareTo(b) < 0) {

					temp = heroarray[j];

					heroarray[j] = heroarray[j + 1];

					heroarray[j + 1] = temp;

				}
			}

		}

		for (int i = 0; i < heroarray.length; i++) {

			System.out.println(heroarray[i]);
		}

	}

}

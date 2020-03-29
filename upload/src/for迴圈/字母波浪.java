package for°j°é;

import java.util.concurrent.TimeUnit;

public class ¦r¥Àªi®ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "abcd";

		for (int i = 0; i < test.length(); i++) {

			char ch = test.charAt(i);

			String k = test.substring(0, i) + Character.toUpperCase(ch) + test.substring(i + 1);
			
			System.out.println(k);
			
			
			try {
				Thread.sleep(1200);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

package stringbufferdemo;

public class Stringbuffdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer("abc");
		StringBuffer c = new StringBuffer(48);//緩層

		System.out.print(a + "\n" + b + "\n" + c);

		final int N = 100000;

		long s = System.currentTimeMillis();

		String str = "*";

		for (int i = 0; i < N; i++) {

			str += "*";

		}

		long e = System.currentTimeMillis();

		System.out.println("總共花了:" + (e - s) + "毫秒");

		// StringBuffer
		s = System.currentTimeMillis();

		StringBuffer str1 = new StringBuffer();

		for (int i = 0; i < N; i++) {

			str1.append("*");

		}

		e = System.currentTimeMillis();

		System.out.println("總共花了:" + (e - s) + "毫秒");

		// StringBuilder
		s = System.currentTimeMillis();

		StringBuilder str2 = new StringBuilder();

		for (int i = 0; i < N; i++) {

			str2.append("*");

		}

		e = System.currentTimeMillis();

		System.out.print("總共花了:" + (e - s) + "毫秒");

	}

}

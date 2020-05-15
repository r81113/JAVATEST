package 包裝類別;

public class Advanced_Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 100;
		Integer num2 = 100;

		System.out.println(num1 == num2);

		Integer a = Integer.valueOf(127);
		Integer b = 127;

		System.out.println(a == b);

		Integer num3 = new Integer(200);
		Integer num4 = new Integer(200);

		System.out.print(num3 == num4);

	}

}

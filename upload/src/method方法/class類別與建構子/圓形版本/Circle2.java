package method��k.class���O�P�غc�l.��Ϊ���;

import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleV2 b = new CircleV2(22);

		b.calculatearea();

		b.calculateperimeter();

		Scanner input = new Scanner(System.in);

		System.out.print("�п�J�b�|:");

		double radius = input.nextDouble();

		CircleV3 c = new CircleV3(radius);

		c.show();

		Circle a = new Circle();

		a.calculatearea();

		a.calculateperimeter();

	}

}

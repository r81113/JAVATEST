package ��ҼҦ�;

public class Staticdemo {

	private static Staticdemo me = null;

	private Staticdemo() {

		// �w�q��k���p��
		me = this;

	}

	public static Staticdemo getInstance() {

		if (me == null) {

			me = new Staticdemo();//�ߤ@���@�����

		}

		return me;
	}

	// �R�A�ݩ� > ���
	public static int static_num = 1;

	public int normel_num = 1;

	// �[�Wstatic
	public static void test() {

		static_num++;
//		normel_num++;

	}

	public static void main(String[] args) {

		Staticdemo static1 = new Staticdemo();
		static1.test();

		System.out.println(static1.static_num);
		System.out.println(static1.normel_num);

		Staticdemo static2 = new Staticdemo();
		static2.test();

		System.out.println(static2.static_num);// �֥[�F!!!
		System.out.println(static2.normel_num);

		static2.test();
		System.out.println(static2.static_num);// �֥[�F!!!

	}

}

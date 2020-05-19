package 單例模式;

public class Staticdemo {

	private static Staticdemo me = null;

	private Staticdemo() {

		// 定義方法為私有
		me = this;

	}

	public static Staticdemo getInstance() {

		if (me == null) {

			me = new Staticdemo();//唯一的一次實例

		}

		return me;
	}

	// 靜態屬性 > 實例
	public static int static_num = 1;

	public int normel_num = 1;

	// 加上static
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

		System.out.println(static2.static_num);// 累加了!!!
		System.out.println(static2.normel_num);

		static2.test();
		System.out.println(static2.static_num);// 累加了!!!

	}

}

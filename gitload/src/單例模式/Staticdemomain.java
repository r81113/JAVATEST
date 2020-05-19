package 單例模式;

public class Staticdemomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//全部都是同一個對象
				
		Staticdemo statictest = Staticdemo.getInstance();

		System.out.println(statictest.static_num);
		System.out.println(statictest.normel_num);

		Staticdemo statictest2 = Staticdemo.getInstance();

		statictest2.static_num = 10;
		statictest2.normel_num = 1024;

		Staticdemo statictest3 = Staticdemo.getInstance();

		System.out.println(statictest3.static_num);
		System.out.println(statictest3.normel_num);
		
		
		System.out.println(statictest==statictest2);

	}

}

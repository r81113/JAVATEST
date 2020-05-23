package 單例模式;

public class SingelModelmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleModelDemo single1 = SingleModelDemo.getInstance();

		System.out.println(single1.count);
		single1.count++;

		SingleModelDemo single2 = SingleModelDemo.getInstance();
		System.out.println(single2.count);

		
		//都相同
		System.out.println(single1 == single2);

	}

}

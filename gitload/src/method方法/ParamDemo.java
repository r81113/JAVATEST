package methodよ猭;

public class ParamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		param("把计代刚",1000);
		
//		System.out.prinf(,);
		
	}

	public static void param(String str, int ...num) {
		
		System.out.println("材把计:" + str);
		
		System.out.println("把计:"+num.length);
		
		for(int i =0;i < num.length;i++) {
			
			System.out.println("材把计:" + num[i]);
			
		}
	}
	
}

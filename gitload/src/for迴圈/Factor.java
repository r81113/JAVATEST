package for°j°é;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factor(100);
		
	}
	
	public static void factor(int num) {
		
		
		for(int i = 1;i <= num ; i++) {
			
			 if(num==i) {
				
				System.out.print(i);
				
				break;
			}
			
		    else if(num%i==0) {
				
				System.out.print(i+",");
			}
			
			
		}
		
	}

}

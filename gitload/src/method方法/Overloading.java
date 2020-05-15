package method¤èªk;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max1 = max(5,8);
         	
        double max2 = max(66.9,12.4);
        
        String max3 = max("trump","obama");
        
		System.out.println(max1+"\n"+max2+"\n"+max3);
	}
	
	static int max(int num1,int num2) {
		
		return num1 > num2?num1:num2;
		
	}

    static double max(double num1,double num2) {
		
		return num1 > num2?num1:num2;
		
	}
	
    static String max(String str1,String str2) {
    	
		if(str1.compareTo(str2) > 0) {
			
			return str1;
			
		}
		
		else {
		
			return str2;
		
		}
	}
    
}

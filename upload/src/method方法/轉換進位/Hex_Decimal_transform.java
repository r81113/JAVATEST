package method��k.�ഫ�i��;

import java.util.Scanner;

public class Hex_Decimal_transform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("�п�J�@�ӼƦr:");
		
        int decnum = input.nextInt();
        
        System.out.println(dectohex(decnum));
        
        System.out.print("�п�J�@��16�i��:");
        
        String hexnum = input.next();
        
        System.out.print(hextodec(hexnum));
      
	}
	
	public static int hextodec(String hexnum) {
	
	     int dec = 0;
	     
	     //E -> 14 2D -> 45
	     for(int i = 0;i < hexnum.length();i++) {
	    	 
	    	 char tmp = hexnum.charAt(i);
	    	 
	    	 if(tmp >= '0' && tmp <= '9') {
	    		 
	    	      dec +=(tmp-'0') * Math.pow(16,hexnum.length()-i-1);
	    	 }
	    	 
	    	 else if(tmp >= 'A' && tmp <= 'F') {
	    		 
	    		  dec +=(tmp - 'A' + 10) * Math.pow(16,hexnum.length()-i-1);
	    		 
	    	 }
	     }
	
		
	     return dec;
			
	
	
	}
	
	public static String dectohex(int decnum) {
		
		String hex ="";
				
		// 45/16 -> ��2    �l��13
		while(decnum!=0) {
			
			int tmp = decnum % 16;
			
			if(tmp >= 0 && tmp <= 9) {
				
				hex = tmp + hex ;
				
			}
			
			else if(tmp >= 10 && tmp <= 15) {
				
				hex = (char)(tmp - 10 + 'A') + hex;
				
			}
			
			decnum/=16;
			
			
		}
						
		return hex;
		
		
	}
}

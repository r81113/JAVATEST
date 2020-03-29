package guessnum;

import java.util.Scanner;

public class Guessnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       
        int i=1;
    
        
		while(i<6) {
			
			System.out.print("猜第"+i+"次:"); 
			int price = input.nextInt();
			
			if(price==5000) {
				if(i==1) {
					
					System.out.print("牛逼!猜第"+i+"次就猜中:蘋果手機!"); 
				
				}else if(i>=2 && 3>=i){
					
					System.out.print("第"+i+"次猜中:筆電!");
					

				}else {
					
					System.out.print("第"+i+"次猜中:藍芽耳機!");
				}	
				break;
			}
			else {
				if(i==5) {
				System.out.println("廢物猜"+i+"次都沒中!!!");
				break;
				}
				System.out.println("沒猜中猜繼續猜~~");
				     	
			}
					
		
            i++;
		}
		
	}

}

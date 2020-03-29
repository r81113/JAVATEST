package continuemethod;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("請輸入數字:");

		int num = input.nextInt();
		
		int result=0;
		
		for(int i=0 ;i<=num;i++) {
			
			if(i%2==1) {
				
				continue;
				
			}
			
			else {
				
				
				
				if(i==num) {
					
					System.out.print(i+"=");
					
					break;
				}
				
				System.out.print(i+"+");
				
			}
			
			result+=i;
			
		}
		System.out.print(result);
		
		
		
		
		
//		Scanner input = new Scanner(System.in);
//		double money = Double.MAX_VALUE;
//	
//		int result = 0;
//        for(int i = 1;i < 6;i++) {
//        	
//        	System.out.println("請輸入第"+i+"位玩家金額:");
//        	money = input.nextDouble();
//        	if(money>500) {	
//        		
//        	
//        		continue;
//        	
//        	}	
//        	result++;
//        	
//        	
////        	if(money<500) {
////        		result++;
////        	}
//        }
//    	System.out.println("消費總金額小於500:"+result);

	}

}

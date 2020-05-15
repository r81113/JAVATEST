package double_circulation;

import java.util.Scanner;

public class Doublecirculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i =1;i<=10000;i++) {
			
			
			int a = i%10,b=i/10%10,c=i/100;
			
			if(a==4 || b==4||c==4) {
				
				continue;
			}
			System.out.println(i);
			count++;
		}
		
		System.out.println("不含4共有:"+count+"個");
		
		
		
//		int result = 0;
//
//		for(int i =100;i<200;i++) {
//			
//			if(i%3==1 && i%4==2 && i%5==3)
//			{
//				System.out.println(i);
//			}		
//		
//		}		
//		
		
		
		
		
//      Scanner input = new Scanner(System.in);
//      char ch ='A';
//      
//      
//       for(int i =1 ;i<=4 ;i++) {
//			
//			for(int j=1;j<=4-i ;j++){
//				
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				
//				if(j==1||j==2*i-1) {
//					
//					System.out.print("1");
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			for(int j =1 ;j<=2*i-1 ;j++){
//				
//				System.out.print((char)ch);
//			}
//			
//			ch ++;
//			
//			System.out.println();			
//		}
//       
//       
//       for(int i =1 ;i<=3 ;i++) {
//			
//			for(int j=1;j<=i ;j++){
//				
//				System.out.print("#");
//			}
//			
//			for(int j =1;j<=7-(2*i);j++){
//				
//				System.out.print((char)ch);
//			}
//			
//			ch ++;
//			
//			System.out.println();
//
//			
//		}
//      

		
	}

}

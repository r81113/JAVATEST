package dowhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    double result =0;
		
		String choice =null;
		
		do {
			
			System.out.println("請輸入兩個數:");
			
			double a=input.nextDouble(),b=input.nextDouble();
				
			System.out.println("請輸入運算元:");
			
			String math = input.next();	
			
			switch(math){
				case "+":
					result=a+b;
					
					break;
					
				case "-":
					result=a-b;
					
					break;
					
				case "*":
					result=a*b;
					
					 break;
				case "/":
					result=a/b;
				
			         break;
				case "%":
					result=a*b;
			
					break;
			} 
			String str=String.format("%.2f", result);
			System.out.println(a+math+b+"="+str);
				
			System.out.println("是否繼續:?(Y/N)"); 	
			choice =input.next();
			
			if("n".equalsIgnoreCase(choice)){
		    
		        System.out.println("結束計算!!!");
		        break;
			}
			
								
		}while("y".equalsIgnoreCase(choice));
		
		
		
		
		
		
		
//		
//	Scanner input = new Scanner(System.in);
//		
//		String choice ="y";
//		
//		String name = null;
//		do {					
//			
//		
//				
//			  	System.out.println("歡迎大俠進入請取名:");
//				name=input.nextLine();
//				
//				System.out.println("頭銜: (出入江湖)");
//				System.out.println("江湖名號:"+name);	
//			
//	     	    System.out.println("是否繼續:?(Y/N)");       	    
//				choice=input.nextLine();
//				
//				
//			   	if("y".equalsIgnoreCase(choice))	{
//			   		
//			   	 System.out.println("歡迎進入江湖!!");
//			   	 break;	
//			   	}	
//					
//				
//		     	while(!"n".equalsIgnoreCase(choice)){
//					
//				     System.out.println("錯誤請重新輸入是否繼續:?(Y/N)");
//				     choice=input.nextLine();		
//				     
//                     if("y".equalsIgnoreCase(choice)){
//				    	 
//				    	 System.out.println("歡迎進入江湖!!");   
//				    	 break;
//				     }
//                     			    
//				
//				 }	
//					
//							
//		
//		}while(!"y".equalsIgnoreCase(choice) );
		
		
		
		
//		while(choice.equals("y"));
		
		
		
		
		
		
		
		
		
		
//        int a=1,b=10;
//        do {
//        	b-=a;
//        	a++;
//        	
//        }while(b--<0);
//        System.out.print(b);
	}

}

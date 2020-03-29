package 練習;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int result = 0;

		for(int i =100;i<200;i++) {
			
			if(i%3==1 && i%4==2 && i%5==3)
			{
				System.out.println(i);
			}		
		
		}
		
	
		

		
//	   Scanner input = new Scanner(System.in);
//	   System.out.print("輸入符號:");
//	   char ch = input.next().charAt(0);
//	   if(ch>='A' && ch<='Z') {
//		   
//		   System.out.print("合法符號");
//
//	   }
//	   else {
//		   
//		   System.err.print("非法符號");
//
//	   }
//		
//------------------------------------------------		
//		Scanner input =new Scanner(System.in);	
//		System.out.print("請輸入金額:");
//	    double money =input.nextDouble();
//	    int result =(int)money;
//	    int thousand,fivehundred,hundred,ten,five,one,zero_point_one;
//	    
//	    thousand   = result/1000;
//	    fivehundred=(result%1000) / 500;	    
//	    hundred    =(result%1000 - fivehundred*500) /100 ;
//	    ten        =(result%1000 - fivehundred*500 - hundred*100 )/ 10 ;
//	    five       =(result%1000 - fivehundred*500 - hundred*100 - ten*10) / 5;
//	    one        =(result%1000 - fivehundred*500 - hundred*100 - ten*10 - five*5) / 1;
//
//	    System.out.println("千元紙鈔:"+thousand+"\n"+"五百元紙鈔:"+fivehundred +"\n"+"一百元紙鈔:"+hundred);
//
//	    System.out.println("十元紙鈔:"+ten+"\n"+"五元紙鈔:"+five +"\n"+"一元紙鈔:"+one);
//
//
//
//		
		
		
	
//----------------------------------------------------------------------		
//		int num=3458;
//
//		int result =0;
//		while(true)
//		{
//			int n=num%10;
//
//			result=result*10+n;
//			num=num/10;
//			if(num==0)
//			{
//				break;
//			}
//		}
//		System.out.println(result);

       
		
//		num1++;	//num = num+1;
//		int result = num1++;	
//		//int result =num1;
//	    //num1++;
//		
//		System.out.println(result);
//
//		System.out.println(num1);
	
//-------------------------------------------------------		
		
//     double num = 5/2f;
// 
// 	   System.out.print(num);

		
//      int num1 = 2147483647;
//		long num2 = 2147483648l;
//		
//		double num3=3.14;
//		float num4 = (float)num3;		
 	   
//      System.out.println(num4);

		
//----------------------------------------------------------------		
		
//	    Scanner scanner = new Scanner(System.in);   
//		char sex = scanner.nextLine().charAt(0);
//		System.out.println("性別:"+sex);
		 
		 
//	   while(true)		
//	   {  
//		 System.out.print("請輸入半徑:");
//		 double radius = scanner.nextDouble();
//         if(radius>0) 
//	     {	   
//		     double s = 3.14*radius*radius;
//             System.out.printf("圓面積:%.2f\n",s);
//         }
//
//         else 
//         {
//             System.err.println("這是錯誤");
//
//         }
//		
//	     }
//	--------------------------------------------------------------------	
//	     System.out.println("\t採購清單");
//	     System.out.println("---------------------------");	     
//	     System.out.println("name:\tPrice:\tNumber:\tP.S");
//         String Name = "巧克力";
//         double price = 50.9;
//         int number = 530;
//         String ps  = "milk....";
//         
//         String str =String.format("%s\t%.2f\t%d\t%s\n",Name,price,number,ps);
//	     System.out.print(str);
//
//         System.out.printf("%s\t%.2f\t%d\t%s\n",Name,price,number,ps);
//	     
//         System.out.printf("%5s\t%.2f\t%d\t%s\n",Name,price,number,ps);
//
//	     System.out.println(Name + "\t" + price + "\t" + number+"\t"+ps);
//	     
//	     System.err.println("我是錯誤訊息!");
//	     
	     
//-----------------------------------------------------------------------	     
	     
//       System.out.println(Integer.MAX_VALUE +1);
//       System.out.println(Integer.MIN_VALUE);
//       
//       System.out.println(Double.MAX_VALUE);
//       System.out.println(Double.MIN_VALUE);
//       
//       System.out.println(Float.MAX_VALUE);
//       System.out.println(Float.MIN_VALUE);

	}

}

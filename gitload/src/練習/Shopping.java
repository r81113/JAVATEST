package 絤策;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input =new Scanner(System.in);
       double price;//砞﹚块も况 ブ盿 の虫基跑计
       int count ; //ヴ種坝珇计秖跑计
       double Total,Total1,Total2,Total3 ;
       
       System.out.print("块も况基窥:");
       price=input.nextDouble();
       System.out.print("块も况计秖:");
       count = input.nextInt();   
       Total1=Total = price*count;
       
       System.out.print("块ブ盿基窥:");
       price=input.nextDouble();
       System.out.print("块ブ盿计秖:");
       count = input.nextInt();      
       Total2= price*count;
       Total+= price*count;
       
       System.out.print("块基窥:");
       price=input.nextDouble();
       System.out.print("块计秖:");
       count = input.nextInt();      
       Total3= price*count;
       Total+= price*count;
       
       
       if(Total1>5000 && Total2>5000 && Total3>5000 || Total>35000) 
       {
    	   
          System.out.println("羆肂:"+Total*0.3);
          System.out.print("ゴ3ч");

       }     
       else 
       {
    	   
           System.out.println("羆肂:"+Total*0.8);
           System.out.print("ゴ8ч");

       }
       
       
       
//       if(Total>=50000)
//       { 
//       
//       
//         System.out.print("羆肂:"+Total*0.7f);
//
//       }
//       else
//       {
//           
//    	 System.out.print("羆肂:"+Total*0.9f);
//
//       }	   
//       
       
       
       
       
       
       
	}

}

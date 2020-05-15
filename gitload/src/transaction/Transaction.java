package transaction;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner input =new Scanner(System.in);
		System.out.print("請輸入從幾年:");

		int year =input.nextInt();	
		
		System.out.print("請輸入多少錢:");

        double money= input.nextDouble();
        double result=0;
        double i=0;
        
        while(money<=2000) 
        {
        	
        	year++;
            money = money*1.25;
            
    		System.out.println(year+"年有:"+(int)money+"億");
    		

            String str =String.format("%d年有:%.2f億", year,money);
    		System.out.println(str);


        	
        	
        }
	}

}

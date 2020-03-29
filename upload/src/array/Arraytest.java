package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##");
        
		System.out.print("請幾個學生:");
		
		int num=input.nextInt();
		
        double array[]=new double [num];
        
        double result=0;
        
        double avg=0;
        
   	    System.out.println("請輸入"+num+"個學生的成績");    
        
        for(int i =0 ;i<array.length;i++){
        	   
    	      System.out.print("這是"+(i+1)+"個學生的成績:"); 
    	      
        	  array[i]=input.nextDouble();             
        	  
        	  result += array[i];
        	  
        	  avg = result/num;
        
        }    
        
        System.out.print("[");    
        for(int i =0 ;i<array.length;i++){
        	
           if(i==num-1) {
        	   
        	   System.out.print(array[i]);    
           }
           else {	  
           System.out.print(array[i]+",");    
           }
           
          
     }  
        System.out.println("]");    
        
   	  System.out.print("總分成績"+result+"\n"+"平均:"+df.format(avg));    
        
        
	}

}

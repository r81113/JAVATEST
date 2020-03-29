package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner input = new Scanner(System.in);
		
		int  insertIndex=-1;
		
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		//多一空間插入			
		int array[]=new int [num.length+1];	
		
		//列出陣列內容
	    for(int i=0 ; i<num.length;i++){
	    	
	          array[i]=num[i];        	
	          
	          System.out.print(array[i]); 
	          
	          if((i+1)%10==0){
	        	  
		          System.out.println(); 

	          }
	          else{
	        	  
	        	  System.out.print(", "); 
	          }
	     } 
//-----------------------------------------------------------------插入	    
	    
	     //插入索引	     
	     System.out.print("輸入要插入的索引: ");	
	      	    	  	 	    	  
	     insertIndex=input.nextInt();
		    
	     //將內容往前移-> 
         for(int i= num.length;i>insertIndex;i--) {
	    	 
	    		 array[i] =array[i-1]; 	 
	     }   
             
         //插入的數字
         System.out.print("輸入要插入的數: "); 
	    	 
         int insertnum=input.nextInt();
	    	       	      	     	  	
         array[insertIndex]=insertnum;    
         
         //列出插入內容,索引
         System.out.println("插入的內容及索引:"+"["+insertIndex+"]"+"="+insertnum); 
         
         //列出目前陣列所有內容              
         for(int i= 0 ; i<array.length;i++) {
        	 
        	     System.out.print(array[i]); 
        	 
	             if((i+1)%array.length==0){
	        	  
		          System.out.println(); 

	             }
	             
	             else{
	        	  
	        	  System.out.print(", "); 
	        	  
	             }    	 
         }
        
	}

}

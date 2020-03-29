package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Delete_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		
		int num[] = new int[10];
								
		//列出原始陣列內容
	    for(int i=0 ; i<num.length;i++){
	       		          
	    	  num[i]=((int)(Math.random()*1000));
	    	  
	          System.out.print(num[i]); 
	          
	          if((i+1)%10==0){
	        	  
		          System.out.println(); 

	          }
	          else{
	        	  
	        	  System.out.print(", "); 
	          }
	     } 
          
	    
        	 
	     System.out.print("請輸入刪除or新增?(I/D)"); 
	     
	     String select=input.nextLine();
//-----------------------------------------------------------------插入	
	     
	     if("I".equalsIgnoreCase(select)) {
	    	 
	    	
	          //多一空間插入			
	 		  int array[]=new int [num.length+1];
	 		  	 		
	 		  
	 		  int  insertIndex=-1;
	 		  
	 		  //將陣列內容+1
	 		  for(int i=0 ; i<num.length;i++){
	 		    	
	 	          array[i]=num[i];        	
	 	          	 	          
	 	     } 
	 		  
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
		
//-----------------------------------------------------------------刪除	
	     	     
	     else if("D".equalsIgnoreCase(select)) {
	    	 
	    	 int deleteIndex=-1;
			  
	    	 int count=num.length;
			    		    	 
			 //輸入刪除索引,	  
	    	 System.out.print("請輸入要刪的索引:");
			 
			 deleteIndex=new Scanner(System.in).nextInt();
					   
			 //找到要刪除的內容	       			        
			 for(int i=0 ; i<num.length;i++){
				        	
				    if(deleteIndex==i) {
				        		
				        deleteIndex=i;
				        break;
				    }
				        	              
		      }	
			 
			 //列出刪除內容,索引	         
	         System.out.println("刪除的內容及索引:"+"["+deleteIndex+"]"+"="+num[deleteIndex]); 
			 
		     count--;	
	         
		     //將內容往後移<- 		 					 
			 for(int i = deleteIndex;i<count;i++) {
						    	
				    num[i]=num[i+1];
						    	 
			 }
		 		
			 
			 //列出目前陣列所有內容 
			 for(int i= 0 ; i<count;i++) {
	        	 
	    	     System.out.print(num[i]); 
	    	 
	             if((i+1)%count==0){
	        	  
		          System.out.println(); 

	             }
	             
	             else{
	        	  
	        	  System.out.print(", "); 
	        	  
	             }    	 
	         }
			 			 			 	    	 
	     }
//-----------------------------------------------------------------刪除	     
	    
		 
    
	}

}

package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Delete_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] num = new int[10];
		  		  
		  int deleteIndex=-1;
		  
		  //紀錄陣列長度			 
		  int count=num.length;
		  
		  //列出陣列內容	    
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
			        
			
				    
//----------------------------------------------------------刪除	
		  
    while(true) {		  
		 System.out.print("請輸入要刪的索引:");
		 
		 deleteIndex=new Scanner(System.in).nextInt();
				   
		 //找到要刪除的內容	       			        
		 for(int i=0 ; i<num.length;i++){
			        	
			    if(deleteIndex==i) {
			        		
			        deleteIndex=i;
			        break;
			    }
			        	              
	      }	
			        
//		 for(int i :num) {
//			        	 
//			        	
//		}
		 
		//列出刪除內容,索引	         
         System.out.println("刪除的內容及索引:"+"["+deleteIndex+"]"+"="+num[deleteIndex]); 
		 
	     //刪除一個陣列空間
	     count--;
	     
	     //將內容往後移<- 		 					 
		 for(int i = deleteIndex;i<count;i++) {
					    	
			    num[i]=num[i+1];
				 	     	 		 
		        Arrays.sort(num);	    	 
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
			        
	}

}

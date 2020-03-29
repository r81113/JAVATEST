package array.one_array_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		
		 int num[] = {22,11,6,99,6,8,100,7,2,3};
		 
		 Arrays.sort(num);
		 
		
        
		 for(int i = 0 ; i<num.length;i++) {			
			 
             System.out.print(num[i]);		
			 
		     if((i+1)%10==0) {
			    System.out.println();
		     }	
		     else {	
			   System.out.print(", ");
		     }		 
			 
	     }
		 
	
		  
		
		  for(int i = 0 ; i<num.length /2 ;i++) {
			 
			  int temp=num[i];
			 
			  num[i] = num[num.length-i-1];
			  
			  num[num.length-i-1]=temp;
			  
		
			 
	     }	 
		 	  System.out.println();
		 
		 	  
		for(int i = 0 ; i<num.length;i++) {
			
			 System.out.print(num[i]);		
			 
		     if((i+1)%10==0) {
			    System.out.println();
		     }	
		     else {	
			   System.out.print(", ");
		     }		 
		}
		
	
	        
		
		
	}

}

package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		Scanner input = new Scanner(System.in);
		
		int  insertIndex=-1;
		
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		
		//�h�@�Ŷ����J			
		int array[]=new int [num.length+1];	
		
		//�C�X�}�C���e
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
//-----------------------------------------------------------------���J	    
	    
	     //���J����	     
	     System.out.print("��J�n���J������: ");	
	      	    	  	 	    	  
	     insertIndex=input.nextInt();
		    
	     //�N���e���e��-> 
         for(int i= num.length;i>insertIndex;i--) {
	    	 
	    		 array[i] =array[i-1]; 	 
	     }   
             
         //���J���Ʀr
         System.out.print("��J�n���J����: "); 
	    	 
         int insertnum=input.nextInt();
	    	       	      	     	  	
         array[insertIndex]=insertnum;    
         
         //�C�X���J���e,����
         System.out.println("���J�����e�ί���:"+"["+insertIndex+"]"+"="+insertnum); 
         
         //�C�X�ثe�}�C�Ҧ����e              
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

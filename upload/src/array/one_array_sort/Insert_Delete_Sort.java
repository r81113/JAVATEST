package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Delete_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		
		int num[] = new int[10];
								
		//�C�X��l�}�C���e
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
          
	    
        	 
	     System.out.print("�п�J�R��or�s�W?(I/D)"); 
	     
	     String select=input.nextLine();
//-----------------------------------------------------------------���J	
	     
	     if("I".equalsIgnoreCase(select)) {
	    	 
	    	
	          //�h�@�Ŷ����J			
	 		  int array[]=new int [num.length+1];
	 		  	 		
	 		  
	 		  int  insertIndex=-1;
	 		  
	 		  //�N�}�C���e+1
	 		  for(int i=0 ; i<num.length;i++){
	 		    	
	 	          array[i]=num[i];        	
	 	          	 	          
	 	     } 
	 		  
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
		
//-----------------------------------------------------------------�R��	
	     	     
	     else if("D".equalsIgnoreCase(select)) {
	    	 
	    	 int deleteIndex=-1;
			  
	    	 int count=num.length;
			    		    	 
			 //��J�R������,	  
	    	 System.out.print("�п�J�n�R������:");
			 
			 deleteIndex=new Scanner(System.in).nextInt();
					   
			 //���n�R�������e	       			        
			 for(int i=0 ; i<num.length;i++){
				        	
				    if(deleteIndex==i) {
				        		
				        deleteIndex=i;
				        break;
				    }
				        	              
		      }	
			 
			 //�C�X�R�����e,����	         
	         System.out.println("�R�������e�ί���:"+"["+deleteIndex+"]"+"="+num[deleteIndex]); 
			 
		     count--;	
	         
		     //�N���e���Ჾ<- 		 					 
			 for(int i = deleteIndex;i<count;i++) {
						    	
				    num[i]=num[i+1];
						    	 
			 }
		 		
			 
			 //�C�X�ثe�}�C�Ҧ����e 
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
//-----------------------------------------------------------------�R��	     
	    
		 
    
	}

}

package array.one_array_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Delete_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] num = new int[10];
		  		  
		  int deleteIndex=-1;
		  
		  //�����}�C����			 
		  int count=num.length;
		  
		  //�C�X�}�C���e	    
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
			        
			
				    
//----------------------------------------------------------�R��	
		  
    while(true) {		  
		 System.out.print("�п�J�n�R������:");
		 
		 deleteIndex=new Scanner(System.in).nextInt();
				   
		 //���n�R�������e	       			        
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
		 
		//�C�X�R�����e,����	         
         System.out.println("�R�������e�ί���:"+"["+deleteIndex+"]"+"="+num[deleteIndex]); 
		 
	     //�R���@�Ӱ}�C�Ŷ�
	     count--;
	     
	     //�N���e���Ჾ<- 		 					 
		 for(int i = deleteIndex;i<count;i++) {
					    	
			    num[i]=num[i+1];
				 	     	 		 
		        Arrays.sort(num);	    	 
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
			        
	}

}

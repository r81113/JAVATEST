package array.one_array_sort;

import java.util.Scanner;

public class Searchobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	    
		     String[] num = {"�i�h������","�_���¦m","�T�W�y��","���Фd��","","","","",""};
		    
		    
	        for(int i=0 ; i<num.length;i++){
	        	
	        	
	        	
	        	System.out.print(num[i]+","); 
	        } 
	        
	    	System.out.println(); 
		    
		    
		    
		    
		    System.out.print("�п�J�n�d������:");
		    
		    String search=new Scanner(System.in).next();
		    
		    int searchIndex=-1;
	       
	        
	        for(int i=0 ; i<num.length;i++){
	        	
	        	if(search.contentEquals(num[i])) {
	        		
	        		searchIndex=i;
	        		break;
	        	}
	        	              
	        }	
	        
//	         for(int i :num) {
//	        	 
//	        	
//	        }
//	         
	        if(searchIndex==-1) {
	        	
	        	System.out.print("�ܿ��,�䤣��!"); 
	        	
	        }
	        else {
	        	
	        	System.out.println("������:"+searchIndex); 
	        	System.out.print("���ޤ��e:"+num[searchIndex]); 
	        }
	        
	       
	        
	        
	        
	}

}

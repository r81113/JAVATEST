package array.one_array_sort;

import java.util.Scanner;

public class Searchobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	    
		     String[] num = {"波多野結衣","北條麻妃","三上悠亞","翔田千里","","","","",""};
		    
		    
	        for(int i=0 ; i<num.length;i++){
	        	
	        	
	        	
	        	System.out.print(num[i]+","); 
	        } 
	        
	    	System.out.println(); 
		    
		    
		    
		    
		    System.out.print("請輸入要查的元素:");
		    
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
	        	
	        	System.out.print("很遺憾,找不到!"); 
	        	
	        }
	        else {
	        	
	        	System.out.println("找到索引:"+searchIndex); 
	        	System.out.print("索引內容:"+num[searchIndex]); 
	        }
	        
	       
	        
	        
	        
	}

}

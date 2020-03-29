package  array;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] num = new int[10];
        for(int i=0 ; i<num.length;i++){
        	
        	num[i]=((int)(Math.random()*1000));
        	
        	System.out.print(num[i]+","); 
        } 
        
    	System.out.println(); 
    	
//        int max=num[0];
//        int min=num[0];
        
    	int max = Integer.MIN_VALUE,min=Integer.MAX_VALUE,even=0,odd=0,e=0,o=0;
    	
    	
        for(int i=0 ; i<num.length;i++){
        	
        	if(num[i]>max) {
          	   
             	max=num[i];
          
             } 
        	
        	 if(num[i]<min) {
          	   
             	
        		min=num[i];
             }
     	
        
        }	
        
        System.out.println("程:"+min); 
        System.out.println("程:"+max); 
             
        System.out.println("----------------------------"); 	
        
        System.out.print("案计:");   
        
        for(int i=0 ; i<num.length;i++){
        	
        	if(num[i]%2==0) {
          	   
        		
        		e=num[i];
        		System.out.print(e+"\t");    
             	even++;
          
             } 
              
        }	
        
        System.out.println();  
        System.out.print("计:"); 
        for(int i=0 ; i<num.length;i++){
        	
        	if(num[i]%2==1) {
          	   
        		
        		o=num[i];
        		System.out.print(o+"\t");    
             	odd++;
          
             } 
              
        }	
        System.out.println();  
        
        
        
          
             System.out.println("----------------------------"); 
          
             System.out.println("案计计:"+even);        
             System.out.println("计计:"+odd);
             
         
        
	}

}

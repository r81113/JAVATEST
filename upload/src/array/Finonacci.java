package array;

public class Finonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num = new int [20];
        
        num[0]=0;
        
        num[1]=1;
              
        double result=0;
         
        for(int i =2 ;i<num.length;i++) {
        	
        	num[i]=num[i-1]+num[i-2];
        	 	
        	
        }
        
       
        		
        for(int i =0 ;i<num.length;i++) {
        	
        	System.out.println(num[i]+",");
        	result+=num[i];  	
        }
        
        System.out.println(result/num.length);
	}

}

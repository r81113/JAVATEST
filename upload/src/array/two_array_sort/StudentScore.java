package array.two_array_sort;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String []studentname= {"悟空","貝吉塔"};
		
        String []subject= {"English","Chinese","Society","Math"};
        
        int ROW=studentname.length;
 
        int COL=subject.length;
        
        double[][] score= new double[ROW][COL];
        
        double total = 0;
              
        double avg=0;
        
		for(int i =0;i<ROW;i++) {  
			
			for(int j =0;j<COL;j++){
				
				System.out.print(studentname[i]+"的"+subject[j]+"成績:");
				
        		score[i][j]=input.nextDouble();       	    
        		       
        	}	        	           
        }     
		
		for(int i =0 ;i<COL; i++){ 
        	
        	System.out.print("\t"+subject[i]);      	   
        }
		
		System.out.print("\t總成績\t平均");
        System.out.println();
        
        for(int i =0;i<ROW;i++) {  
        	               	
         	System.out.print(studentname[i]);          
         	
        	for(int j =0;j<COL;j++){
        		       
        		System.out.print("\t"+score[i][j]); 
        		total+=score[i][j];
        		avg=total/COL;
        	}
        	
        	  System.out.print("\t"+total);
        	  System.out.print("\t"+avg);
              System.out.println();
        }     
        
  
  
         
      
	}

}

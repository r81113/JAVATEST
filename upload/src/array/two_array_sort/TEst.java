package array.two_array_sort;

import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	     String[] name = {"�i�h������","�_���¦m","�T�W�y��","���Фd��","","","","",""};
	        
	     String[] levelname= {"�Q�H","���m","�Q�m","�ӶQ�m","�ӦZ"};
			
	     int[]level = new int [10];
	                
	     int[]love  = new int [10];
	     
	     int count = 4;
	        
	     int gameday = 1;
		
		 
	     
  	     for(int i = 0 ; i < count ; i++) {
    	
    	     System.out.println(name[i] + "\t" + levelname[level[i]] + "\t" +love[i]);
    	
        }
	}

}

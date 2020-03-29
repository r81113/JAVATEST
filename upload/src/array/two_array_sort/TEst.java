package array.two_array_sort;

import java.util.Scanner;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	     String[] name = {"ªi¦h³¥µ²¦ç","¥_±ø³Â¦m","¤T¤W±y¨È","µ¾¥Ð¤d¨½","","","","",""};
	        
	     String[] levelname= {"¶Q¤H","À§¦m","¶Q¦m","¬Ó¶Q¦m","¬Ó¦Z"};
			
	     int[]level = new int [10];
	                
	     int[]love  = new int [10];
	     
	     int count = 4;
	        
	     int gameday = 1;
		
		 
	     
  	     for(int i = 0 ; i < count ; i++) {
    	
    	     System.out.println(name[i] + "\t" + levelname[level[i]] + "\t" +love[i]);
    	
        }
	}

}

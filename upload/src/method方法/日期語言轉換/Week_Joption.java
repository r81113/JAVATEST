package method��k.����y���ഫ;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Week_Joption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
	  
       String language[]={"����","�^��","���"};
       
       while(true) {   
    	   
    	   Object lan=JOptionPane.showInputDialog(null
           		  ,"�п�y��"
           		  ,"�y����"
           		  ,0
           		  ,new ImageIcon("")  				
   	              ,language
                  ,"�q�{��"
   	       );
    	      	   
    	  String translate=lan.toString();
    	 	                
          switch(translate) {
          
            case "����":
            	
              Object  weekweek=JOptionPane.showInputDialog(null
              		  ,"���ѬP���X(1-7):"
              		  ,"��ܬP��"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"�q�{��"
      	      );
      	
                int week=Integer.parseInt(weekweek.toString());    
                
                showchinese(week-1);
               
                break;
        
            case "�^��":

                weekweek=JOptionPane.showInputDialog(null
              		  ,"���ѬP���X(1-7):"
              		  ,"��ܬP��"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"�q�{��"
      	        );
      	
                week=Integer.parseInt(weekweek.toString());   
                
                showEnglish(week-1);
                
                break;
                
            case "���":

                weekweek=JOptionPane.showInputDialog(null
              		  ,"���ѬP���X(1-7):"
              		  ,"��ܬP��"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"�q�{��"
      	       );
      	
                week=Integer.parseInt(weekweek.toString());     
                
                showJapanese(week-1);
            
                break;
          } 
          
            
                 
          
       }
     
	}
	

	public static void showchinese(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"�P���@","�P���G","�P���T","�P���|","�P����","�P����","�P����"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"����P��"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));

		
	}
	
	public static void showEnglish(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"�^��P��"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));
	}
		
	public static void showJapanese(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"���`��","���`��","���`��","���`��","���`��","�g�`��","���`��"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"���P��"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));
	}
	
	
	//�P�_1-7
	private static boolean isRight(int day) {
		
		if(day<1||day>7) {
			
			return false;
		}
		return true;
		
	}

}

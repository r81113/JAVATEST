package method方法.日期語言轉換;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Week_Joption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
	  
       String language[]={"中文","英文","日文"};
       
       while(true) {   
    	   
    	   Object lan=JOptionPane.showInputDialog(null
           		  ,"請選語言"
           		  ,"語言表"
           		  ,0
           		  ,new ImageIcon("")  				
   	              ,language
                  ,"默認值"
   	       );
    	      	   
    	  String translate=lan.toString();
    	 	                
          switch(translate) {
          
            case "中文":
            	
              Object  weekweek=JOptionPane.showInputDialog(null
              		  ,"今天星期幾(1-7):"
              		  ,"選擇星期"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"默認值"
      	      );
      	
                int week=Integer.parseInt(weekweek.toString());    
                
                showchinese(week-1);
               
                break;
        
            case "英文":

                weekweek=JOptionPane.showInputDialog(null
              		  ,"今天星期幾(1-7):"
              		  ,"選擇星期"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"默認值"
      	        );
      	
                week=Integer.parseInt(weekweek.toString());   
                
                showEnglish(week-1);
                
                break;
                
            case "日文":

                weekweek=JOptionPane.showInputDialog(null
              		  ,"今天星期幾(1-7):"
              		  ,"選擇星期"
              		  ,0
              		  ,new ImageIcon("")  				
      	              ,new String[]{"1","2","3","5","6","7"}
                      ,"默認值"
      	       );
      	
                week=Integer.parseInt(weekweek.toString());     
                
                showJapanese(week-1);
            
                break;
          } 
          
            
                 
          
       }
     
	}
	

	public static void showchinese(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"中文星期"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));

		
	}
	
	public static void showEnglish(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"英文星期"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));
	}
		
	public static void showJapanese(int num) {
		// TODO Auto-generated method stub
		   
		String [] weekday= {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		
		JOptionPane.showMessageDialog(null
				,weekday[num]
				,"日文星期"
				,JOptionPane.INFORMATION_MESSAGE
				,new ImageIcon(""));
	}
	
	
	//判斷1-7
	private static boolean isRight(int day) {
		
		if(day<1||day>7) {
			
			return false;
		}
		return true;
		
	}

}

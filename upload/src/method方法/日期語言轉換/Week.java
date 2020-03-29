package method方法.日期語言轉換;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Week {
	
    public static Scanner input = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	         	      	            	      	      
       while(true) {   
    	    
    	  showlan();   
    	  
    	  int lan=input.nextInt();
    	  	  
          switch(lan) {
          
            case 0:
            	        	
            	System.out.println("請輸入星期(1-7)?");	
            	
            	int week=input.nextInt();     

                showchinese(week-1);
               
                break;
        
            case 1:
                
            	System.out.println("請輸入星期(1-7)?");	
            	
            	week=input.nextInt();         
            	                 	
                showEnglish(week-1);
                
                break;
                
            case 2:
                         
            	System.out.println("請輸入星期(1-7)?");	
            	
            	week=input.nextInt();         
            	            	
                showJapanese(week-1);
            
                break;
                
          }                                               
       }
}
	

 public static void showchinese(int num) {
		// TODO Auto-generated method stub
	  if(isRight(num)){	
				
		 String [] weekday= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		
		 System.out.println(weekday[num]);	
		 
	  }
  }
	
  public static void showEnglish(int num) {
		// TODO Auto-generated method stub
	  if(isRight(num)){	
				
		 String [] weekday= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		 System.out.println(weekday[num]);	
		 
		
	  }
	  
  }
		
  public static void showJapanese(int num) {
		// TODO Auto-generated method stub
	    if(isRight(num)){	
		
	      String [] weekday= {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		
		  System.out.println(weekday[num]);	
		
		}
  }
	
  
  public static void showlan() {
		// TODO Auto-generated method stub
	  
	  String language[]={"中文","英文","日文"};
	  
	  System.out.println("請輸入語言?");	
	  
	  for(int i =0;i<language.length;i++) {
		  
		  System.out.println(language[i]+":"+i);	
	  }
		  
  }
	
	//判斷1-7
  private static boolean isRight(int day) {
		
		if(day<0||day>6) {
											
		     System.out.println("必須輸入1-7!!");	         
		     
		     return false;
		         		         					
		}
		
		return true;
			
	
	}
		
}



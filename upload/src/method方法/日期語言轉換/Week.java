package method��k.����y���ഫ;

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
            	        	
            	System.out.println("�п�J�P��(1-7)?");	
            	
            	int week=input.nextInt();     

                showchinese(week-1);
               
                break;
        
            case 1:
                
            	System.out.println("�п�J�P��(1-7)?");	
            	
            	week=input.nextInt();         
            	                 	
                showEnglish(week-1);
                
                break;
                
            case 2:
                         
            	System.out.println("�п�J�P��(1-7)?");	
            	
            	week=input.nextInt();         
            	            	
                showJapanese(week-1);
            
                break;
                
          }                                               
       }
}
	

 public static void showchinese(int num) {
		// TODO Auto-generated method stub
	  if(isRight(num)){	
				
		 String [] weekday= {"�P���@","�P���G","�P���T","�P���|","�P����","�P����","�P����"};
		
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
		
	      String [] weekday= {"���`��","���`��","���`��","���`��","���`��","�g�`��","���`��"};
		
		  System.out.println(weekday[num]);	
		
		}
  }
	
  
  public static void showlan() {
		// TODO Auto-generated method stub
	  
	  String language[]={"����","�^��","���"};
	  
	  System.out.println("�п�J�y��?");	
	  
	  for(int i =0;i<language.length;i++) {
		  
		  System.out.println(language[i]+":"+i);	
	  }
		  
  }
	
	//�P�_1-7
  private static boolean isRight(int day) {
		
		if(day<0||day>6) {
											
		     System.out.println("������J1-7!!");	         
		     
		     return false;
		         		         					
		}
		
		return true;
			
	
	}
		
}



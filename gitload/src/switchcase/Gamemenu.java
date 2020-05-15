package switchcase;

import java.util.Scanner;

public class Gamemenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);
         
		System.out.println("1.登錄遊戲");
		System.out.println("2.退出遊戲");
        System.out.print("請選擇輸入?:");
        int choice = input.nextInt();
         
		if(choice == 1) {
	      	
		 System.out.println("1.傳音入密");
         System.out.println("2.舉目四望");
         System.out.println("3.會會老友");
         System.out.println("4.自我欣賞");
         System.out.println("5.觀察地形");
         System.out.println("6.到此一遊");
         System.out.println("請選擇輸入?:");
         
          while(true) {
             choice = input.nextInt();
         
             switch(choice) {
         
             case 1:
            
        	 break;
        	 
             case 2:
             
        	 break;
        	 
             case 3:
        	 System.out.println("笑傲江湖 >會會老友");
             System.out.println("1.顯示所有好友訊息");
             System.out.println("2.添加好友");            
        	 break;
        	 
             case 4:
             
        	 break;
        	 
             case 5:
             
        	 break;
        	 
             case 6:
             
        	 break;
        	 
             default:
             System.err.println("輸入錯誤!!");
        	 break;
           } 
          
         }
         
		}
		
		else if(choice==2){
			
			 System.exit(0);		
		}
		
		else {
			 System.err.println("輸入錯誤!!! 遊戲退出");

			
		}
	}

}

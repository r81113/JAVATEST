package pk;



import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Fight {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		File Sound= new File("sounds/拳皇97.wav");
		PlaySound(Sound);
		
		System.out.print("請輸入玩家名稱:");	
		String userName =input.next();
		
		String comName ="八神庵";
		System.out.println(userName+"VS"+comName);
		
	
		
		int hp1=100 ,hp2=100;
		int attack1=0 ,attack2=0;
        while(hp1>0 && hp2>=0){
    	   
    	   attack1=(int)(Math.random()*10000)%11 + 5;
    	   attack2=(int)(Math.random()*10000)%11 + 5;
    	
		   System.out.println(userName+"血量:"+hp1+"\t"+comName+"血量:"+hp2);
		

		   
    	   hp2-=attack1;  	
    	   if(attack1>=0 && attack1<=5) {
    			System.out.println(comName + "被重重打一拳");
    	   }else if(attack1 >= 6 && attack1<= 10) {
   			     System.out.println(comName + "打到要害!!!!"+attack1);

    	   }
   		 
   		   
    	   hp1-=attack2;
    	   if(attack2>=0 && attack2<=5) {
   			     System.out.println(userName + "被重重打一拳"+attack2);
   	       }else if(attack2>= 6 && attack2<=10) {
  			     System.out.println(userName + "打到要害!!!!"+attack2);

   	       }
  		 
   	
       }
		
		
		
		//(int)(Math.random()*10000)%(b-a+1) + a;
		
    	System.out.println("K.O.");
    	System.out.println("玩家姓名\t血量");

    	System.out.println(userName + "\t" + hp1);
    	System.out.println(comName + "\t" + hp2);

		
		
		System.out.print("請繼續輸入!");
		input.nextLine();
	
		
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public	static void PlaySound(File Sound) {

		  

		  try {

		   Clip clip=AudioSystem.getClip();

		   clip.open(AudioSystem.getAudioInputStream(Sound));

		   clip.start();


		  }

		  catch(Exception e) {

		   System.out.println("音樂文件輸入錯誤。");}

		 }
}



package method��k.�s���T��;

import java.util.concurrent.TimeUnit;

public class Show_Game_Message_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SendMessage("���K�J");
	}
	
	//����reloading2
    public static void SendMessage(String nickname, String channelname) {
		
		
		SendMessage(nickname, channelname, "",4,45);
		
	}
	
	//����reloading
	public static void SendMessage(String nickname) {
		
		String[] content = {"�A�O��?","�@�ɭn�׵��F!!!","�w��Ө��]�~�@��!"};
		
		SendMessage(nickname, "�w�]�W�D", content[(int)(Math.random()*2)],10,1);
		
	}
	
		
	public static void SendMessage(String name, String channel, String message, int count, int interval) {
		
		if(interval < 5) interval = 5;
		
		
		String value = String.format("[%s] %s %s ", 
				channel, name, message			  	
	    );
		
		for(int i = 0;i < count;i++) {
			
	
			
			System.out.println(value);
			
			try {
				//Thread.sleep(interval*1000);
				TimeUnit.SECONDS.sleep(interval);
							
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			System.out.println("---------");

		
		}
	
	
	
		
		
	}

}

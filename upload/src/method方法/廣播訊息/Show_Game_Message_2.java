package method方法.廣播訊息;

import java.util.concurrent.TimeUnit;

public class Show_Game_Message_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SendMessage("王八蛋");
	}
	
	//重載reloading2
    public static void SendMessage(String nickname, String channelname) {
		
		
		SendMessage(nickname, channelname, "",4,45);
		
	}
	
	//重載reloading
	public static void SendMessage(String nickname) {
		
		String[] content = {"你是誰?","世界要終結了!!!","歡迎來到魔獸世界!"};
		
		SendMessage(nickname, "預設頻道", content[(int)(Math.random()*2)],10,1);
		
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

package method方法.廣播訊息;

import java.util.concurrent.TimeUnit;

public class Show_Game_Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int money=1000;
		
		System.out.println("鑽石:"+money+"\n---------");
		
		SendMessage("王八蛋", "世界頻道", "公會打王(40/人團), 有空的++", 5, 1,money);
	}

	public static void SendMessage(String name, String channel, String message, int count, int interval,int diamond ) {
		
		if(interval < 5) interval = 5;
		
		
		String value = String.format("[%s] %s %s ", 
				channel, name, message			  	
	    );
		
		for(int i = 0;i < count;i++) {
			
			diamond-=10;
			
			System.out.println(value+"\n目前鑽石剩:"+diamond);
			
			try {
				//Thread.sleep(interval*1000);
				TimeUnit.SECONDS.sleep(interval);
							
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			System.out.println("---------");

		
		}
	
		//鑽石-10
	
		
		
	}
	
	
	
}

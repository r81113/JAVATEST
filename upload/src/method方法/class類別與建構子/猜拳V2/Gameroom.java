package method方法.class類別與建構子.猜拳V2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Gameroom {

	// 武器
	private Humanplayer player1 = null;

	private Complayer player2 = null;

	// 房間id
	private int roomid;
	// 房間名稱
	private String roomname;
	// 房間密碼
	private String roompass;

	public Gameroom(String roomName,String roomPass) throws IOException {

		if(!("admin".equals(roomName) && "123".equals(roomPass))) {
			
			System.out.println("密碼錯誤,遊戲退出!!");
			
			return;
		}
		
		this.setRoomname(roomName);				
						
		initgame();
		
		getRoomid();
		
		startgame();
		
		endgame();

	}


	// 初始遊戲loading
	public void initgame() throws IOException {

		player1 = new Humanplayer();

		player2 = new Complayer();

		JFrame f = new JFrame("JProgressBar Sample");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = f.getContentPane();

		JProgressBar progressBar = new JProgressBar();

		progressBar.setStringPainted(true);
		
		Border border = BorderFactory.createTitledBorder("Reading...");

		progressBar.setBorder(border);

		content.add(progressBar, BorderLayout.NORTH);
		
		f.setSize(400, 200);
		
		f.setVisible(true);
		
		for (int i = 0; i <= 100; i++) {
			
			progressBar.setValue(i);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==100) {
				
				 f.dispose();   
			}
		}
		
		
		System.out.println("遊戲加載成功!!");
	}

	public void startgame() {
		
		menu();
		
		chooserole();
		
		gaming();

	}

	private void gaming() {
		
	 while(true) {	
		 	
		System.out.print(player1.getName()+"請出拳:");
		
		Scanner input = new Scanner(System.in);
		
		player1.setFist(input.nextInt());
		
		int fist1=player1.getFist();		
		
	    int fist2=player2.getFist(); 	
				
		int result = judge(fist1,fist2);
		
		//輸贏訊息
		if(result == -1) {
			
			System.out.println(player1.getName()+"贏了!!");
			
			player1.sendMessage(Humanplayer.MessagetypeWin);
			
			player2.sendMessage(Humanplayer.Messagetypelose);			
		}
		
		else if(result==0) {
			
			System.out.println("雙方打平!!");
			
			player1.sendMessage(Humanplayer.MessagetypeFist);
			
			player2.sendMessage(Humanplayer.MessagetypeFist);
			
		}
		
		else {
			
			System.out.println(player2.getName()+"贏了!!");
			
			player2.sendMessage(Humanplayer.MessagetypeWin);
			
			player1.sendMessage(Humanplayer.Messagetypelose);
		}
		
		System.out.println("是否繼續遊戲?");
		
		String answer = new Scanner(System.in).next();
		
		if(!"y".equalsIgnoreCase(answer)) {
			
			break;
		}

	  }
	}

	public void menu() {

		System.out.println("歡迎進入"+"<<"+roomname+">>房間");
		
		System.out.println("出拳規則:");
		
		System.out.println("出拳規則:1-剪刀 2-石頭 3-布");
		
	}

	public void chooserole() {
				
		System.out.println("對方角色:1-風間2-妮妮3-正男4-阿呆");
		
		System.out.print("請選擇對方角色:");
		
		int choice = new Scanner(System.in).nextInt();
		
		String choose[] = { "風間", "妮妮", "正男", "阿呆" };
		
		player2.setName(choose[choice-1]);
		
		player1.setName("野原新之助");
		
		System.out.println(player1.getName()+"VS." + player2.getName());
	}

	public int judge(int fist1,int fist2) {		
								
		if(fist1==fist2) {
			
			return 0;
			
		}
		
		else if(fist1==1 && fist2==3 
				|| fist1==2 && fist2==1
				|| fist1==3 && fist2==2) {
			
			player1.setScore(player1.getScore()+1);
			
			player2.setScore(player2.getScore()-1);
			
			return -1;
		}
		
		else {
			
		    player1.setScore(player1.getScore()-1);
		
		    player2.setScore(player2.getScore()+1);
		
		    return 1;
		}
	}
	
	

	public void endgame() {
		
		System.out.println(player1.getName()+"\t"+player2.getName());
		
		System.out.println(player1.getScore()+"\t"+player2.getScore());
		
		System.out.print("Game Over");
	}

	public int getRoomid() {
		
		roomid=(int)(Math.random()*10000) + 1;
		
		System.out.println("房號ID-"+roomid);
		
		return roomid;
	}

	public void setRoomid(int roomid) {
		
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getRoompass() {
		return roompass;
	}

	public void setRoompass(String roompass) {
		this.roompass = roompass;
	}

}

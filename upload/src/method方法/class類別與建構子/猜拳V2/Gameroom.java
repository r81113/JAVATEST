package method��k.class���O�P�غc�l.�q��V2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Gameroom {

	// �Z��
	private Humanplayer player1 = null;

	private Complayer player2 = null;

	// �ж�id
	private int roomid;
	// �ж��W��
	private String roomname;
	// �ж��K�X
	private String roompass;

	public Gameroom(String roomName,String roomPass) throws IOException {

		if(!("admin".equals(roomName) && "123".equals(roomPass))) {
			
			System.out.println("�K�X���~,�C���h�X!!");
			
			return;
		}
		
		this.setRoomname(roomName);				
						
		initgame();
		
		getRoomid();
		
		startgame();
		
		endgame();

	}


	// ��l�C��loading
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
		
		
		System.out.println("�C���[�����\!!");
	}

	public void startgame() {
		
		menu();
		
		chooserole();
		
		gaming();

	}

	private void gaming() {
		
	 while(true) {	
		 	
		System.out.print(player1.getName()+"�ХX��:");
		
		Scanner input = new Scanner(System.in);
		
		player1.setFist(input.nextInt());
		
		int fist1=player1.getFist();		
		
	    int fist2=player2.getFist(); 	
				
		int result = judge(fist1,fist2);
		
		//��Ĺ�T��
		if(result == -1) {
			
			System.out.println(player1.getName()+"Ĺ�F!!");
			
			player1.sendMessage(Humanplayer.MessagetypeWin);
			
			player2.sendMessage(Humanplayer.Messagetypelose);			
		}
		
		else if(result==0) {
			
			System.out.println("���襴��!!");
			
			player1.sendMessage(Humanplayer.MessagetypeFist);
			
			player2.sendMessage(Humanplayer.MessagetypeFist);
			
		}
		
		else {
			
			System.out.println(player2.getName()+"Ĺ�F!!");
			
			player2.sendMessage(Humanplayer.MessagetypeWin);
			
			player1.sendMessage(Humanplayer.Messagetypelose);
		}
		
		System.out.println("�O�_�~��C��?");
		
		String answer = new Scanner(System.in).next();
		
		if(!"y".equalsIgnoreCase(answer)) {
			
			break;
		}

	  }
	}

	public void menu() {

		System.out.println("�w��i�J"+"<<"+roomname+">>�ж�");
		
		System.out.println("�X���W�h:");
		
		System.out.println("�X���W�h:1-�ŤM 2-���Y 3-��");
		
	}

	public void chooserole() {
				
		System.out.println("��訤��:1-����2-�g�g3-���k4-���b");
		
		System.out.print("�п�ܹ�訤��:");
		
		int choice = new Scanner(System.in).nextInt();
		
		String choose[] = { "����", "�g�g", "���k", "���b" };
		
		player2.setName(choose[choice-1]);
		
		player1.setName("����s���U");
		
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
		
		System.out.println("�и�ID-"+roomid);
		
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

package method方法.class類別與建構子.猜拳V2;

import java.io.IOException;
import java.util.Scanner;

public class Testmain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
						
		Scanner input = new Scanner(System.in);
			
		System.out.println("請輸入遊戲房號:");
		
		String roomname = input.next();
		
		System.out.println("請輸入房號密碼:");
		
		String pass = input.next();
						
		new Gameroom(roomname ,pass);

	}

}

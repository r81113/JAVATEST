package method��k.class���O�P�غc�l.�q��V2;

import java.io.IOException;
import java.util.Scanner;

public class Testmain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
						
		Scanner input = new Scanner(System.in);
			
		System.out.println("�п�J�C���и�:");
		
		String roomname = input.next();
		
		System.out.println("�п�J�и��K�X:");
		
		String pass = input.next();
						
		new Gameroom(roomname ,pass);

	}

}

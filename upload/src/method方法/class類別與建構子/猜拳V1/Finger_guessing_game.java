package method��k.class���O�P�غc�l.�q��V1;

import java.util.Scanner;

public class Finger_guessing_game {

	public String a[] = { "�ŤM", "���Y", "��" };

	public String b = a[(int) Math.random() * 3];

	public String choose[] = { "����", "�g�g", "���k", "���b" };

	public int select = 0;

	public int select2= 0;
	
	public String yesorno;
	
	public int count=0;

	Scanner input = new Scanner(System.in);

	public String[] getA() {

		System.out.print("�X���W�h:");

		for (int i = 0; i < a.length; i++) {

			System.out.print((i + 1) + "." + a[i] + "\t");

		}

		System.out.println();

		return a;
	}

	public String[] getChoose() {

		System.out.print("��訤��:");

		for (int i = 0; i < choose.length; i++) {

			System.out.print((i + 1) + "." + choose[i] + "      ");

		}

		System.out.println();

		return choose;
	}

	public void setselect() {

		System.out.print("�п�ܹ�訤��:");

		select = input.nextInt();
		
        while(select>4) {
        	
        	System.out.print("�����訤��!!:");
        	
        	select = input.nextInt();
        	
        	continue;
		}
        
		System.out.print("�����s���UVS." + getselect());
				
		System.out.println();
		
	}

	public String getselect() {

		return choose[select - 1];

	}

	public void PK() {

		System.out.print("�г���s���U�вq��:");

		select2 = input.nextInt();
		
		 while(select2>3) {
	        	
	        	System.out.print("����n�q����!!:");
	        	
	        	select2 = input.nextInt();
	        	
	        	continue;
		}
	        
		System.out.println("����s���U�X��:" + a[select2 - 1]);

		System.out.println(getselect() + "�X:" + b);

		if (a[select2 - 1] == a[0] && b == a[0] 
				|| a[select2 - 1] == a[1] && b == a[1]
				|| a[select2 - 1] == a[2] && b == a[2]) {

			System.out.println("���襭��");

		}

		else if (a[select2 - 1] == a[0] && b == a[2] 
				|| a[select2 - 1] == a[1] && b == a[0]
				|| a[select2 - 1] == a[2] && b == a[1]) {

			System.out.println("����s���UĹ�F!!");
			
			count++;
		}

		else {

			System.out.println(getselect() + "Ĺ�F!!");
		}

		
	}

	public void show() {

		System.out.println("�w��i�J�����p�s�q���C��!!");

		getA();

		getChoose();
		
		setselect();

		PK();
					
		System.out.println("����sĹ�F"+count+"��");
		
		while (true) {
			

			
			System.out.print("�O�_�~��U�@��?(Y/N)");
					   		    
			yesorno = input.next();
			
		    System.out.println("---------------------------");
		    
			if ("y".equalsIgnoreCase(yesorno)) {

				PK();
				
				System.out.println("����sĹ�F"+count+"��");
			}
			
			else if("n".equalsIgnoreCase(yesorno)) {
				
				System.out.println("GAME OVER");

				break;
				
			}

		}
	}

}

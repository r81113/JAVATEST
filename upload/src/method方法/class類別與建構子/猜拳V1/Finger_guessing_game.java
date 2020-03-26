package method方法.class類別與建構子.猜拳V1;

import java.util.Scanner;

public class Finger_guessing_game {

	public String a[] = { "剪刀", "石頭", "布" };

	public String b = a[(int) Math.random() * 3];

	public String choose[] = { "風間", "妮妮", "正男", "阿呆" };

	public int select = 0;

	public int select2= 0;
	
	public String yesorno;
	
	public int count=0;

	Scanner input = new Scanner(System.in);

	public String[] getA() {

		System.out.print("出拳規則:");

		for (int i = 0; i < a.length; i++) {

			System.out.print((i + 1) + "." + a[i] + "\t");

		}

		System.out.println();

		return a;
	}

	public String[] getChoose() {

		System.out.print("對方角色:");

		for (int i = 0; i < choose.length; i++) {

			System.out.print((i + 1) + "." + choose[i] + "      ");

		}

		System.out.println();

		return choose;
	}

	public void setselect() {

		System.out.print("請選擇對方角色:");

		select = input.nextInt();
		
        while(select>4) {
        	
        	System.out.print("重輸對方角色!!:");
        	
        	select = input.nextInt();
        	
        	continue;
		}
        
		System.out.print("野源新之助VS." + getselect());
				
		System.out.println();
		
	}

	public String getselect() {

		return choose[select - 1];

	}

	public void PK() {

		System.out.print("請野原新之助請猜拳:");

		select2 = input.nextInt();
		
		 while(select2>3) {
	        	
	        	System.out.print("重輸要猜的拳!!:");
	        	
	        	select2 = input.nextInt();
	        	
	        	continue;
		}
	        
		System.out.println("野原新之助出拳:" + a[select2 - 1]);

		System.out.println(getselect() + "出:" + b);

		if (a[select2 - 1] == a[0] && b == a[0] 
				|| a[select2 - 1] == a[1] && b == a[1]
				|| a[select2 - 1] == a[2] && b == a[2]) {

			System.out.println("雙方平手");

		}

		else if (a[select2 - 1] == a[0] && b == a[2] 
				|| a[select2 - 1] == a[1] && b == a[0]
				|| a[select2 - 1] == a[2] && b == a[1]) {

			System.out.println("野原新之助贏了!!");
			
			count++;
		}

		else {

			System.out.println(getselect() + "贏了!!");
		}

		
	}

	public void show() {

		System.out.println("歡迎進入蠟筆小新猜拳遊戲!!");

		getA();

		getChoose();
		
		setselect();

		PK();
					
		System.out.println("野原新贏了"+count+"次");
		
		while (true) {
			

			
			System.out.print("是否繼續下一輪?(Y/N)");
					   		    
			yesorno = input.next();
			
		    System.out.println("---------------------------");
		    
			if ("y".equalsIgnoreCase(yesorno)) {

				PK();
				
				System.out.println("野原新贏了"+count+"次");
			}
			
			else if("n".equalsIgnoreCase(yesorno)) {
				
				System.out.println("GAME OVER");

				break;
				
			}

		}
	}

}

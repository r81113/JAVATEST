package method方法.class類別與建構子.猜拳V2;

public class Complayer {


	public static final int MessagetypeFist = 1;

	public static final int MessagetypeWin = 2;
	
	public static final int Messagetypelose = 3;

	private String name;
	private int score;
	private int fist;

	private String[] fistWord = { 
			"嚙踐�蕭����",
			"���嚙踝蕭����蕭",
			"���頩筆�~~",
			"77777",
			"���蕭��雓ｇ蕭"
		
	};

	private String[] winWord = { 
			"嚙踝��蕭",
			"嚙踐���",
			"���嚙踐���蕭�",
			"嚙踝蕭謜������蕭嚙踝��",
			"���嚙踝蕭謚渲嚙踝蕭豯株雓���蕭"
	};

	private String[] loseWord = {
			"������蕭嚙�",
			"���嚙踝蕭謖��蕭",
			"���雓",
			"嚙踝�蕭嚙踝�嚙踝蕭��嚙踝蕭謅蕭���",
			"���嚙踐���蕭謏��嚙踐扑RR"
	};

	//
	public void sendMessage(int msgtype) {

		int index = ((int) (Math.random() * 4));

		String message = null;

		switch (msgtype) {

		case MessagetypeFist:

			message = fistWord[index];

			break;

		case MessagetypeWin:

			message = winWord[index];

			break;

		case Messagetypelose:

			message = loseWord[index];

			break;

		}

		System.out.println(message);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {

		this.fist = (int)(Math.random()*3)+1;

        if(this.fist==1) {
			
			System.out.println(getName()+"���������");	
			
		}
		
		else if(this.fist==2) {
			
			System.out.println(getName()+"������蕭��韏荔蕭");	
			
		}
		
		else if(this.fist==3) {
			
			System.out.println(getName()+"����蕭���蕭");	
		}
        
		return this.fist;
	}

}

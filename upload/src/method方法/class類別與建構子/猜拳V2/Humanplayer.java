package method方法.class類別與建構子.猜拳V2;

public class Humanplayer {

	
	public static final int MessagetypeFist = 1;

	public static final int MessagetypeWin = 2;

	public static final int Messagetypelose = 3;

	private String name;
	
	private int score;
	
	private int fist;

	private String[] fistWord = { 
			"嘿嘿~~",
			"嘻嘻~~",
			"BANG",
			"77777",
			"BOOM"
		
	};

	private String[] winWord = { 
			"嫩",
			"廢物~~",
			"爽啦~~",
			"滾去旁邊~",
			"還敢來RR"
	};

	private String[] loseWord = {
			"可惡~~",
			"幹在一場",
			"靠北",
			"操~~~~",
			"我不信!!!!"
	};

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
		
		return fist;
		
	}

	public void setFist(int fist) {

		this.fist = fist;

		if (fist == 1) {

			System.out.println(getName() + "出剪刀");

		}

		else if (fist == 2) {

			System.out.println(getName() + "出石頭");

		}

		else if (fist == 3) {

			System.out.println(getName() +"出布");

		}
	}

}

package inherit.Game;

public class Game_character {

	private String nickname;
	private int level;
	private int maxlife;
	private int currentlife;

	public Game_character() {

		//System.out.println("父類構造");

	}

	public Game_character(String nickname, int level, int maxlife, int currentlife) {
		super();
		this.nickname = nickname;
		this.level = level;
		this.maxlife = maxlife;
		this.currentlife = currentlife;
	}

	//排序
	public int comparetobyname(Game_character hero) {
		
		return getNickname().compareTo(hero.getNickname());
		
	}		
	
	// 要比較的英雄對象
	public int compareto(Game_character hero) {
		// 比較等級
		if (this.level > hero.getLevel()) {

			return 1;
			
		} else if (this.level == hero.getLevel()) {
			
			return 0;

		} else {

			return -1;
		}

	}

	public void move() {

		System.out.println("Hero類move方法");

	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxlife() {
		return maxlife;
	}

	public void setMaxlife(int maxlife) {
		this.maxlife = maxlife;
	}

	public int getCurrentlife() {
		return currentlife;
	}

	public void setCurrentlife(int currentlife) {
		this.currentlife = currentlife;
	}

}

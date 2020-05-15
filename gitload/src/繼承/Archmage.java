package 繼承;

public class Archmage extends Game_character {

	private int magicattack;
	
	//每增一個角色ID++ 靜態!!
	public static int ID=1;
	
	public Archmage() {
		
		setNickname("默認法師"+ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setMagicattack(50);
		ID++;
	}
	
	public Archmage(String name) {
		
		this();//調用本類默認方法
		setNickname(name);
		
	}
	
	@Override //重寫字串方法
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer(getLevel());
		
		str.append(getNickname());
	
		str.append("\t");
		
		str.append(getLevel());
		
		str.append("\t");

		str.append(getMaxlife());
		
		str.append("\t");

		str.append(getCurrentlife());
		
		str.append("\t");

		str.append(getMagicattack());

		return str.toString();
	}
		
	public void fireball() {

		System.out.println("法師" + getNickname() + "正準備丟火球!");

	}

	public int getMagicattack() {
		return magicattack;
	}

	public void setMagicattack(int magicattack) {
		this.magicattack = magicattack;
	}

}

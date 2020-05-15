package inherit.Game;

public class Warrior extends Game_character {

	// 物理攻擊
	private int pysicalattack1;
	
	//每增一個角色ID++ 靜態!!
	public static int ID=1;

	public Warrior() {

		// super();//子類構造調用父類別

		// System.out.println("子類構造");
		setNickname("默認戰士"+ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setPysicalattack(99);
		ID++;

	}

	public Warrior(String nickname, int pysicalattack) {

		setNickname(nickname);

		setPysicalattack(pysicalattack);

	}

	@Override // 重寫字串

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

		str.append(getPysicalattack());

		return str.toString();
	}

	@Override // 比較兩個是否相等
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (!(obj instanceof Warrior)) {

			return false;
		}

		Warrior newWarrior = (Warrior) obj;

		// 比較
		if (getNickname().equals(newWarrior.getNickname()) && getPysicalattack() == newWarrior.getPysicalattack()) {

			return true;
		}

		return false;
	}

	@Override // 重寫
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("戰士移動靠腿!!");
	}

	// 重寫父類
//	public void move() {
//
//		System.out.println(getNickname()+":移動靠腿!!");
//
//	}

	public int getPysicalattack() {

		return pysicalattack1;
	}

	public void setPysicalattack(int pysicalattack) {

		this.pysicalattack1 = pysicalattack;
	}

}

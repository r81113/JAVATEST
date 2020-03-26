package method方法.class類別與建構子.英雄資訊;

import java.util.Scanner;

public class Hero_Game_inform {

	private long id;

	private String nickname;

	private int level;

	private double currentexp;// 當前

	private double exp;// 升級所需(固定)

	public Hero_Game_inform() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero_Game_inform(String nickname) {

		this.nickname = nickname;

	}

	public Hero_Game_inform(long id, String nickname, int level, long exp) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.level = level;
		this.exp = exp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {

		if (id <= 0) {

			this.id = 1;

		}

		else {

			this.id = id;

		}
	}

	public String getNickname() {
		return nickname;
	}

	// 不可修改名字
	private void setNickname(String nickname) {

		if (null == nickname) {

			this.nickname = "未知英雄";

		}

		else {

			this.nickname = nickname;

		}
	}

	public int getLevel() {

		if (currentexp >= getExp()) {

			int upgrade=level;
			
			level += 1;
			
			System.out.println("升等:"+upgrade+"--->"+level);
		}

		return level;
	}

	public void setLevel(int level) {

		if (level < 1 || level > 999) {

			this.level = 1;// 重練

		}

		else {

			this.level = level;

		}

	}

	public double getCurrentexp() {

		if (currentexp >= exp) {

			currentexp = currentexp - exp;

		}

		else {

			double tmp = 0;

			tmp = (double) Math.random() * 100;

			currentexp += tmp;
		}

		return currentexp;

	}

	public double getExp() {

		exp = ((long) Math.pow(level - 1, 3) + 60) / 5 * ((level - 1) * 2 + 60);

		return exp;
	}

	public void show() {

		Scanner input = new Scanner(System.in);

		System.out.print("請輸入ID:");

		this.id = input.nextInt();

		setId(this.id);

		System.out.print("請輸入等級:");

		this.level = input.nextInt();

		setLevel(this.level);

		System.out.print("請輸入名字:");

		this.nickname = input.next();

		setNickname(this.nickname);

		System.out.println("-----------------");

		System.out.println("序號:" + this.getId());

		System.out.println("等級:" + this.getLevel());

		System.out.println("名字:" + this.getNickname());

		System.out.println("當前經驗值----->" + currentexp);

		System.out.println("升級所需經驗值--->" + this.getExp());

		System.out.println("打怪?(y/n)");

		String s = input.next();

		if (s.equals("1")) {

			while (this.level < 1000) {

				System.out.println("-----------------");

				System.out.println("序號:" + this.getId());

				System.out.println("等級:" + this.getLevel());

				System.out.println("名字:" + this.getNickname());

				System.out.printf("當前經驗值----->%.2f%n" ,this.getCurrentexp());

				System.out.println("升級所需經驗值--->" + this.getExp());

				System.out.println("繼續打怪?(Enter)");

				s = input.next();

				if (s.equals("1")) {

					continue;

				} else {
					System.out.println("遊戲結束");
					System.exit(0);

				}

			}
		} else {
			System.out.println("遊戲結束");
			System.exit(0);

		}
	}
}

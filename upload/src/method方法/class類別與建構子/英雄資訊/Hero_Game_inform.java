package method��k.class���O�P�غc�l.�^����T;

import java.util.Scanner;

public class Hero_Game_inform {

	private long id;

	private String nickname;

	private int level;

	private double currentexp;// ��e

	private double exp;// �ɯũһ�(�T�w)

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

	// ���i�ק�W�r
	private void setNickname(String nickname) {

		if (null == nickname) {

			this.nickname = "�����^��";

		}

		else {

			this.nickname = nickname;

		}
	}

	public int getLevel() {

		if (currentexp >= getExp()) {

			int upgrade=level;
			
			level += 1;
			
			System.out.println("�ɵ�:"+upgrade+"--->"+level);
		}

		return level;
	}

	public void setLevel(int level) {

		if (level < 1 || level > 999) {

			this.level = 1;// ���m

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

		System.out.print("�п�JID:");

		this.id = input.nextInt();

		setId(this.id);

		System.out.print("�п�J����:");

		this.level = input.nextInt();

		setLevel(this.level);

		System.out.print("�п�J�W�r:");

		this.nickname = input.next();

		setNickname(this.nickname);

		System.out.println("-----------------");

		System.out.println("�Ǹ�:" + this.getId());

		System.out.println("����:" + this.getLevel());

		System.out.println("�W�r:" + this.getNickname());

		System.out.println("��e�g���----->" + currentexp);

		System.out.println("�ɯũһݸg���--->" + this.getExp());

		System.out.println("����?(y/n)");

		String s = input.next();

		if (s.equals("1")) {

			while (this.level < 1000) {

				System.out.println("-----------------");

				System.out.println("�Ǹ�:" + this.getId());

				System.out.println("����:" + this.getLevel());

				System.out.println("�W�r:" + this.getNickname());

				System.out.printf("��e�g���----->%.2f%n" ,this.getCurrentexp());

				System.out.println("�ɯũһݸg���--->" + this.getExp());

				System.out.println("�~�򥴩�?(Enter)");

				s = input.next();

				if (s.equals("1")) {

					continue;

				} else {
					System.out.println("�C������");
					System.exit(0);

				}

			}
		} else {
			System.out.println("�C������");
			System.exit(0);

		}
	}
}

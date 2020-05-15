package 繼承;

public class Objectarraysort {

	public static void sort(Game_character[] heroarray) {

		Game_character temp = null;

		for (int i = 0; i < heroarray.length; i++) {
			for (int j = 0; j < heroarray.length-i-1; j++) {

				if (heroarray[j].comparetobyname(heroarray[j + 1]) < 0) {
					temp = heroarray[j];
					heroarray[j] = heroarray[j + 1];
					heroarray[j + 1] = temp;

				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior 達爾 = new Warrior();
		Warrior 悟空 = new Warrior();
		Warrior 比克 = new Warrior();
		Warrior 悟飯 = new Warrior();
		Warrior 克林 = new Warrior();

		Archmage 法1 = new Archmage();
		Archmage 法2 = new Archmage();
		Archmage 法3 = new Archmage();
		Archmage 法4 = new Archmage();
		Archmage 法5 = new Archmage();

		Game_character[] heroarray = { 達爾, 悟空, 比克, 悟飯, 克林, 法1, 法2, 法3, 法4, 法5

		};
		
		System.out.println("排序前:");

		System.out.println("名字\t等級\tMaxlife\tlife\tAttack");

		for (Game_character hero : heroarray) {

			System.out.println(hero);
		}
		
		System.out.println("------------------------------");
		
		sort(heroarray);
		
		System.out.println("排序後:");

		System.out.println("名字\t等級\tMaxlife\tlife\tAttack");

		for (Game_character hero : heroarray) {

			System.out.println(hero);
		}

	}

}

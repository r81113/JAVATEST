package inherit.Game;

public class Game_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Warrior 愛德華 = new Warrior("愛德華",1500); 
					
		Warrior 悟空 = new Warrior("悟空",1500); 
		
		愛德華.setLevel(1);
		
		悟空.setLevel(1);

		System.out.println(愛德華.compareto(悟空));
		
		System.out.println(愛德華==悟空);
		
		System.out.println(愛德華.equals(悟空));//所有都是Object

		System.out.println(愛德華.toString());
		

		//Game_character 魔鬼終結者 = new Warrior();
		
//		Game_character 魔鬼終結者; //聲明角色 
//		
//		魔鬼終結者 = new  Warrior();//調用子類初使化
//		
//		魔鬼終結者.move();
		System.out.println("-------------------------------");

		Archmage 甘道夫 = new Archmage("甘道夫");		
		甘道夫.fireball(); 
		System.out.println(甘道夫.getNickname());
		System.out.println("級別:"+甘道夫.getLevel());
		System.out.println("最大生命:"+甘道夫.getMaxlife());
		System.out.println("目前生命:"+甘道夫.getCurrentlife());
		System.out.println("魔法攻擊:"+甘道夫.getMagicattack());
		
		System.out.println("-------------------------------");
		
		System.out.println(甘道夫.toString());
		System.out.println(甘道夫);
		
		System.out.println("-------------------------------");

		Archmage 哈利波特 = new Archmage();		

		System.out.println(哈利波特);


	}

}

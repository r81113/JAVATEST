package method方法.class類別與建構子.演員系統;

public class ActorSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActorSystem role1 = new ActorSystem();
		
		role1.name="悟空";
		
		role1.level=30;
		
		role1.job = "賽亞人";
		
		role1.skill();
		
		role1.show();
		
		ActorSystem role2 = new ActorSystem();
		
		role2.name="比克";
		
		role2.level=25;
		
		role2.job="那美克星人"; 
		
		role2.skill();
		
		role2.show();

		
		ActorSystem role3 = new ActorSystem();
		
		role3.name="貝吉塔";
		
		role3.skill();
		
		role3.show();

		
	}

}

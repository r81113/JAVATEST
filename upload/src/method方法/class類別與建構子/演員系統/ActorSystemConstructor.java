package method方法.class類別與建構子.演員系統;

public class ActorSystemConstructor {

public String name;
	
	public int level;
	
	public String job;
	   
	public ActorSystemConstructor() {
		
	}
	
	//方法與類名一樣
	public ActorSystemConstructor (String name1,int level1,String job1) {
		
		name = name1;
		
		level = level1;
		
		job=job1;
	}
	
	public void show() {
    	   	
		   System.out.println(name+"\t"+level+"\t"+job);
   	 	
    }	
		
	public void skill() {
		
	   if(name.equals("悟空")) {	
		
		   System.out.println("龜-------派---氣---功----波!!!!!!!!!!!!!!!!");
		   
	   }
	   
	   else if(name.equals("比克")) {
		   
		   System.out.println("魔-----貫------光殺砲!!!!!!!!!!!!!!!!");
	   }
	   
	   else {
		   		   
		   System.out.println(name+"發出必殺!!!!!!!!!!!!!!!!");
		   
	   }
	   
	}
	

	
}

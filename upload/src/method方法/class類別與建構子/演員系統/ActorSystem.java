package method方法.class類別與建構子.演員系統;

public class ActorSystem {
    
	public String name;
	
	public int level;
	
	public String job;
	
	
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

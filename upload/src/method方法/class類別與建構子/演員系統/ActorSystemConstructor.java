package method��k.class���O�P�غc�l.�t���t��;

public class ActorSystemConstructor {

public String name;
	
	public int level;
	
	public String job;
	   
	public ActorSystemConstructor() {
		
	}
	
	//��k�P���W�@��
	public ActorSystemConstructor (String name1,int level1,String job1) {
		
		name = name1;
		
		level = level1;
		
		job=job1;
	}
	
	public void show() {
    	   	
		   System.out.println(name+"\t"+level+"\t"+job);
   	 	
    }	
		
	public void skill() {
		
	   if(name.equals("����")) {	
		
		   System.out.println("�t-------��---��---�\----�i!!!!!!!!!!!!!!!!");
		   
	   }
	   
	   else if(name.equals("��J")) {
		   
		   System.out.println("�]-----�e------������!!!!!!!!!!!!!!!!");
	   }
	   
	   else {
		   		   
		   System.out.println(name+"�o�X����!!!!!!!!!!!!!!!!");
		   
	   }
	   
	}
	

	
}

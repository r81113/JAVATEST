package inherit.player;

public class Dunk extends Warmup {

	public Dunk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dunk(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
    @Override
    public void performs() {
    	// TODO Auto-generated method stub    	
		System.out.println("球員" + getName() + "正在表演灌籃秀!");

    }

}

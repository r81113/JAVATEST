package inherit.player;

public class Threepoint extends Warmup {

	public Threepoint() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Threepoint(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performs() {
		// TODO Auto-generated method stub
		System.out.println("球員" + getName() + "正在表演三分球!");
	}
	
}

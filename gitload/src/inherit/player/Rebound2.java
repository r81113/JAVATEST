package inherit.player;

public class Rebound2 extends Warmup {

	public Rebound2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rebound2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performs() {
		// TODO Auto-generated method stub
		System.out.println("球員" + getName() + "正在瘋狂打人搶籃板!");
	}
}

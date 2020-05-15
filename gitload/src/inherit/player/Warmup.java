package inherit.player;

//抽象無法實體化!!!!!
public abstract class Warmup {

	private String name;

	public Warmup() {
	}

	public Warmup(String name) {
		setName(name);
	}

	// 表演方法
	public void performs() {

		System.out.println("球員" + name + "正在熱身!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

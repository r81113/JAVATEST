package inherit.player;

//��H�L�k�����!!!!!
public abstract class Warmup {

	private String name;

	public Warmup() {
	}

	public Warmup(String name) {
		setName(name);
	}

	// ��t��k
	public void performs() {

		System.out.println("�y��" + name + "���b����!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

package 單例模式;

public class SingleModelDemo {

	private static SingleModelDemo me = null;

	public int count = 0;

	private SingleModelDemo() {

		count++;

	}

	// 獲得本類唯一的一個實例單例模式的核心方法

	public static SingleModelDemo getInstance() {

		if (null == me)
			
			me = new SingleModelDemo();

		return me;
	}

}

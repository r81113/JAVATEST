package ��ҼҦ�;

public class SingleModelDemo {

	private static SingleModelDemo me = null;

	public int count = 0;

	private SingleModelDemo() {

		count++;

	}

	// ��o�����ߤ@���@�ӹ�ҳ�ҼҦ����֤ߤ�k

	public static SingleModelDemo getInstance() {

		if (null == me)
			
			me = new SingleModelDemo();

		return me;
	}

}

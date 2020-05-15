package stringbufferdemo;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str1 = new StringBuffer("hello world!");
		StringBuffer str2 = new StringBuffer("hello world!");
		StringBuffer str3 = new StringBuffer("hello world!");
		StringBuffer str4 = new StringBuffer("hello world!");
		StringBuffer str5 = new StringBuffer("hello world!");
						
		System.out.println(str1);

		// 反轉
		System.out.println(str2.reverse());

		// 插入
//		System.out.println(str3.insert(3, "abc"));		
		System.out.println(str3.insert(3, 4L));// 小數

		// 刪除
//		System.out.println(str4.deleteCharAt(3));

		System.out.println(str4.delete(2, 4));

		// 取代
		System.out.println(str4.replace(2, 4, "台灣"));

		// 大小
		System.out.println("緩存:" + str1.capacity());
						
		// 清空
		str1.setLength(0);
		
		//設定空間大小
		str1.trimToSize();

		

	}

}

package 圖片練習;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dialogdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//參數1 父對話框
		JOptionPane.showMessageDialog(null, "錯誤");
		
		//參數2 對話框中的提示訊息
		//參數3 對話框中的標題訊息
		//參數4 對話框中的消息類型		
		
		JOptionPane.showMessageDialog(null, "今天吃了沒?","噓寒問暖",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "今天吃了沒?","噓寒問暖",JOptionPane.WARNING_MESSAGE);
		
		//參數5 對話框顯示的圖片對象	
		
		JOptionPane.showMessageDialog(null, "今天吃了沒?","噓寒問暖",JOptionPane.WARNING_MESSAGE,new ImageIcon("image/三上悠亞.jpg"));

		//對話框選擇
		JOptionPane.showInputDialog(null, "吃了嗎?","標題",0,new ImageIcon("image/三上悠亞.jpg"),
				
		                 new String[]{"1.吃了","2.關你屁事","3.今天一起吃ㄅ!"},
		                 "默認值"
		);
		
		//對話框抉擇Yes or NO
		JOptionPane.showConfirmDialog(null, "到底去不去吃");	
		
		

	}

}

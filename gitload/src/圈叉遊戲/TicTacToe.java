package 圈叉遊戲;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	static ArrayList<Integer> playerpostion = new ArrayList<Integer>();
	static ArrayList<Integer> cpupostion = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char rule[][] = {
				// 第一欄00,02,04
				{ ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },

				// 第二欄20,22,24
				{ ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },

				// 第三欄40,42,44
				{ ' ', '|', ' ', '|', ' ' } };

		result(rule);

		while (true) {

			// Player
			Scanner input = new Scanner(System.in);

			System.out.print("請輸入1-9:");

			int playerchoose = input.nextInt();

			while (playerpostion.contains(playerchoose) || cpupostion.contains(playerpostion)) {

				System.out.println("請重輸入1-9:");

				playerchoose = input.nextInt();
			}

			System.out.println(playerchoose);

			placePiece(rule, playerchoose, "player");

			// CPU
			Random rand = new Random();

			int cpuchoose = rand.nextInt(9) + 1;

			while (playerpostion.contains(cpuchoose) || cpupostion.contains(cpuchoose)) {

				System.out.println("請重輸入1-9:");

				cpuchoose = rand.nextInt(9) + 1;
			}

			placePiece(rule, cpuchoose, "cpu");

			// 顯示
			result(rule);

			win();				
			
		}
	}

	public static void result(char[][] rule) {

		for (char i = 0; i < rule.length; i++) {

			for (char j = 0; j < rule[i].length; j++) {

				System.out.print(rule[i][j]);

			}

			System.out.println();

		}
	}

	public static void placePiece(char[][] rule, int choose, String user) {

		char symbol = ' ';

		if (user.equals("player")) {

			symbol = 'X';

			playerpostion.add(choose);

		} else if (user.equals("cpu")) {

			symbol = 'O';
			cpupostion.add(choose);

		}

		switch (choose) {

		case 1:
			rule[0][0] = symbol;
			break;

		case 2:
			rule[0][2] = symbol;
			break;

		case 3:
			rule[0][4] = symbol;
			break;

		case 4:
			rule[2][0] = symbol;
			break;

		case 5:
			rule[2][2] = symbol;
			break;

		case 6:
			rule[2][4] = symbol;
			break;

		case 7:
			rule[4][0] = symbol;
			break;

		case 8:
			rule[4][2] = symbol;
			break;

		case 9:
			rule[4][4] = symbol;
			break;

		}

	}

	public static String win() {

		// switch case 數字
		List toprow = Arrays.asList(1, 2, 3);
		List midrow = Arrays.asList(4, 5, 6);
		List botrow = Arrays.asList(7, 8, 9);

		List leftcol = Arrays.asList(1, 4, 7);
		List midcol = Arrays.asList(2, 5, 8);
		List rightcol = Arrays.asList(3, 6, 9);

		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);

		List<List> winning = new ArrayList<List>();

		winning.add(toprow);
		winning.add(midrow);
		winning.add(botrow);

		winning.add(leftcol);
		winning.add(midcol);
		winning.add(rightcol);

		winning.add(cross1);
		winning.add(cross2);

		for (List i : winning) {

			if (playerpostion.containsAll(i)) {
				
				System.out.println("恭喜你贏了!!");

				System.exit(0);

				

			} else if (cpupostion.containsAll(i)) {
				
				System.out.println("電腦贏了!!");

				System.exit(0);

			} else if (playerpostion.size() + cpupostion.size() == 9) {
				
				System.out.println("DOG");

				System.exit(0);

			}

		}
		return "";

	}

}

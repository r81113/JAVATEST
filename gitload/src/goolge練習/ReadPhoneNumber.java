package goolge練習;

import java.util.Scanner;

public class ReadPhoneNumber {

	public void output(int caseNo, String res) {
		System.out.println("Case #" + caseNo + ": " + res);

	}

	public String solve(String number, String formator) {
		String[] form = formator.split("-");
		int beginIndex = 0;
		String res = "";
		for (int i = 0; i < form.length; i++) {
			int n = Integer.parseInt(form[i]);
			String part = number.substring(beginIndex, beginIndex + n);

			res += readPart(part) + " ";
			beginIndex += n;

		}
		return res.trim();//它返回此字符串的一個副本（開頭和結尾的空格去掉）或者這個字符串冇有前導或結尾空白格.
	}

	public String readPart(String number) {
		int continuous = 1;
		char last = number.charAt(0);
		String res = "";
		for (int i = 1; i < number.length(); i++) {
			if (number.charAt(i) == last) {
				continuous++;
				continue;
			} else {
				res += readContinuous(continuous, last);
				last = number.charAt(i);
				continuous = 1;
			}

		}
		res += readContinuous(continuous, last);
		return res.trim();
	}

	public String readContinuous(int continuous, char last) {
		String res = "";
		switch (continuous) {
		case 1:
			res += charToName(last) + " ";
			break;
		case 2:
			res += "double " + charToName(last) + " ";
			break;
		case 3:
			res += "triple " + charToName(last) + " ";
			break;
		case 4:
			res += "quadruple " + charToName(last) + " ";
			break;
		case 5:
			res += "quintuple " + charToName(last) + " ";
			break;
		case 6:
			res += "sextuple " + charToName(last) + " ";
			break;
		case 7:
			res += "septuple " + charToName(last) + " ";
			break;
		case 8:
			res += "octuple " + charToName(last) + " ";
			break;
		case 9:
			res += "nonuple " + charToName(last) + " ";
			break;
		case 10:
			res += "decuple " + charToName(last) + " ";
			break;
		default:
			for (int k = 0; k < continuous; k++)
				res += charToName(last) + " ";
			break;
		}
		return res;
	}

	public String charToName(char c) {
		int n = c - '0';
		String res = "";
		switch (n) {
		case 0:
			res = "zero";
			break;
		case 1:
			res = "one";
			break;
		case 2:
			res = "two";
			break;
		case 3:
			res = "three";
			break;
		case 4:
			res = "four";
			break;
		case 5:
			res = "five";
			break;
		case 6:
			res = "six";
			break;
		case 7:
			res = "seven";
			break;
		case 8:
			res = "eight";
			break;
		case 9:
			res = "nine";
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner;
		ReadPhoneNumber p = new ReadPhoneNumber();

		scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int count = T;
		while (count-- > 0) {
			String number = scanner.next();
			String formator = scanner.next();
			String result = p.solve(number, formator);
			p.output(T - count, result);
		}
	}

}

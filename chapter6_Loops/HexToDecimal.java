package chapter6_Loops;

import java.util.Scanner;

public class HexToDecimal {

	public static void main(String[] args) {
		// Task: Convert hex number to a decimal one
		Scanner input = new Scanner(System.in);
		String hex = input.nextLine();
		String[] number = hex.split("");
		int res = 0;
		int power = 0;
		for (int i = number.length - 1; i >= 0; i--, power++) {
			switch (number[i]) {
			case "A":
				res += 10 * Math.pow(16, power);
				break;
			case "B":
				res += 11 * Math.pow(16, power);
				break;
			case "C":
				res += 12 * Math.pow(16, power);
				break;
			case "D":
				res += 13 * Math.pow(16, power);
				break;
			case "E":
				res += 14 * Math.pow(16, power);
				break;
			case "F":
				res += 15 * Math.pow(16, power);
				break;
			default:
				res += Integer.parseInt(number[i]) * Math.pow(16, power);
				break;
			}
		}
		System.out.println(res);
	}

}

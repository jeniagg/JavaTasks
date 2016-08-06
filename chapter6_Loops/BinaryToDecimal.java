package chapter6_Loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// Task: Convert Binary number to a decimal one
		Scanner input = new Scanner(System.in);
		String binary = input.nextLine();
		while (binary.length() != 8) {
			binary = "0" + binary;
		}
		String[] num = binary.split("");
		int res = 0;
		int power = 0;
		for (int i = 7; i > 0; i--, power++) {
			res += Integer.parseInt(num[i]) * Math.pow(2, power);
		}
		System.out.println(res);
	}

}

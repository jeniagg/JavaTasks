package chapter6_Loops;

import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		// Task: Convert decimal number to a binary one
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String binary = "";
		while (n != 0) {
			binary = n % 2 + binary;
			n = n / 2;
		}
		while (binary.length() != 8) {
			binary = "0" + binary;
		}
		System.out.println(binary);
	}

}

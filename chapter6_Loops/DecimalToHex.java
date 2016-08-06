package chapter6_Loops;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		// Task: Convert decimal number to a hex one
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt();
		String remainder = "";
		while (decimal != 0) {

			switch (decimal % 16) {
			case 10:
				remainder = "A" + remainder;
				break;
			case 11:
				remainder = "B" + remainder;
				break;
			case 12:
				remainder = "C" + remainder;
				break;
			case 13:
				remainder = "D" + remainder;
				break;
			case 14:
				remainder = "E" + remainder;
				break;
			case 15:
				remainder = "F" + remainder;
				break;
			default:
				remainder = decimal % 16 + remainder;
				break;
			}
			decimal = decimal / 16;
		}
		System.out.println(remainder);
	}

}

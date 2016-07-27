package chapter6_Loops;

import java.util.Scanner;

public class NotDevidedBy3And7 {

	public static void main(String[] args) {
		// Task: print the numbers 1 to N that are not divided by 3 and 7
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 21 != 0) {
				System.out.println(i);
			}
		}

	}

}

package chapter6_Loops;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n <= 0) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 1; i <= n; i++) {
				for (int j = i; j < i + n; j++) {
					System.out.print(j + " ");

				}
				System.out.println("\n");
			}
		}
	}
}

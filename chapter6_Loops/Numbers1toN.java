package chapter6_Loops;

import java.util.Scanner;

public class Numbers1toN {

	public static void main(String[] args) {
		//Task: Print the numbers from 1 to n
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (n < 1) {
			System.out.println("Wrong input");
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}

}

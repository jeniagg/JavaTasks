package chapter6_Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomInt {

	public static void main(String[] args) {
		// Task: Generate random int number between 1 and n
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		Random r = new Random();
		int answer = r.nextInt(n) + 1;
		System.out.println(answer);
	}
}

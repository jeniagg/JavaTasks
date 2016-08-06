package chapter6_Loops;

import java.util.Scanner;

public class ZeroFactorial {

	public static void main(String[] args) {
		// Task: how many zeros are there at the end of n! for given n
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String number = FactorialTasks.factorial(n) + "";
		int count = 0;
		String[] arr = number.split("");
		for (int i = arr.length - 1; i > 0; i--) {
			if (!arr[i].equals("0")) {
				break;
			}
			count++;
		}
		System.out.println(count);

	}

}

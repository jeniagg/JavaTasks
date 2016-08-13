package chapter7_Arrays;

import java.util.Scanner;

public class Task2_IdenticalArrays {

	public static void main(String[] args) {
		// Task: Read two arrays and check if they are identical.
		System.out.println("Enter the lengths of the two arrays: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] arrFirst = new int[n];
		int[] arrSecond = new int[m];
		if (n != m) {
			System.out
					.println("Arrays are not identical. They have different number of elements.");
		} else {
			System.out.println("Enter the elements of the first array: ");
			for (int i = 0; i < arrFirst.length; i++) {
				arrFirst[i] = input.nextInt();
			}
			System.out.println("Enter the elements of the second array: ");
			for (int i = 0; i < arrSecond.length; i++) {
				arrSecond[i] = input.nextInt();
			}
			boolean identical = true;
			for (int i = 0; i < arrFirst.length; i++) {
				if (arrFirst[i] != arrSecond[i]) {
					identical = false;
					break;
				}
			}
			if (identical) {
				System.out.println("The two arrays are identical.");
			} else {
				System.out.println("The two arrays are not identical.");
			}

		}
	}

}
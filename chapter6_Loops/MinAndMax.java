package chapter6_Loops;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		// Task: Read n numbers from the console and and print the smallest and
		// the biggest one
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the count of the numbers");
		int n = input.nextInt();
		System.out.println("Enter " + n + " numbers: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min: " + min + "\nMax: " + max);

	}
}

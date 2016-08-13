package chapter7_Arrays;

import java.util.Scanner;

public class Task4_SequenceOfEqual {

	public static void main(String[] args) {
		// Task: Find the longest sequence of equal elements in an array
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = input.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int count = 1, maxLength = 1, startIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count > maxLength) {
					maxLength = count;
					startIndex = i + 1 - count;
				}
				count = 1;
			}
		}
		for (int i = startIndex; i < startIndex + maxLength; i++) {
			System.out.print(arr[i] + " ");

		}

	}
}

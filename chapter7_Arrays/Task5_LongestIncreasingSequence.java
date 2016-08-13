package chapter7_Arrays;

import java.util.Scanner;

public class Task5_LongestIncreasingSequence {

	public static void main(String[] args) {
		// Task: Find the longest increasing sequence of numbers in the array
		System.out.println("Enter the length of the element:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		int startIndex = 0, count = 1, maxLength = 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
			} else {
				if (count > maxLength) {
					startIndex = i + 1 - count;
					maxLength = count;
				}
				count = 1;
			}
		}
		for (int i = startIndex; i < startIndex + maxLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

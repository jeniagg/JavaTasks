package chapter7_Arrays;

public class InitializeArray {

	public static void main(String[] args) {
		// Task: Initialize array with 20 elements. Set each element to be its
		// index multiplied by 5
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
			System.out.print(arr[i] + " ");
		}

	}

}

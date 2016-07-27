package chapter6_Loops;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int arr[] = new int[n];
			arr[0] = 0;
			arr[1] = 1;
			int sum = 1;
			int i = 2;
			while (i < n) {
				arr[i] = arr[i - 1] + arr[i - 2];
				sum += arr[i];
				i++;
			}
			return sum;
		}

	}
}

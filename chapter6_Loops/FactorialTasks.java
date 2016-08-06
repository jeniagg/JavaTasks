package chapter6_Loops;

import java.util.Scanner;

public class FactorialTasks {

	public static void main(String[] args) {
		System.out.println(factorial(7));
		System.out.println(factorial(0));

		Scanner input = new Scanner(System.in);
		// System.out.println("Enter K: ");
		// int k = input.nextInt();
		System.out.println("Enter N bigger than K: ");
		int n = input.nextInt();

		// System.out.println(result(k, n));
		// System.out.println(res(n, k));
		// System.out.println("Enter x: ");
		// int x = input.nextInt();
		// System.out.println(sum(n, x));

		System.out.println(catalansNumber(n));

	}

	// Task N!/K!, where 1<K<N
	public static int result(int k, int n) {
		if (k > n || k < 0 || n < 2) {
			throw new IllegalArgumentException();
		}
		return factorial(n) / factorial(k);
	}

	// Task: N!*K!/(N-K)!
	public static int res(int n, int k) {
		if (n < 0 || k < 0 || n < k) {
			throw new IllegalArgumentException();
		} else {
			return (factorial(n) * factorial(k)) / factorial(n - k);
		}
	}

	// Task: S = 1 + 1!/x + 2!/ (x^2) + ... + n!/(x^n)
	public static double sum(int n, int x) {
		double sum = 1.0;
		for (int i = 1; i <= n; i++) {
			sum += factorial(i) / Math.pow(x, i);
		}
		return sum;
	}

	// Task: Catalan's numbers: Cn = (2n)! / ((n+1)!*n!), where n >= 0
	public static double catalansNumber(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		} else {
			double result = 0.0;
			result += factorial(2 * n) / (factorial(n + 1) * factorial(n));
			return result;
		}
	}

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0 || n == 1) {
			return 1;
		} else {
			int fact = 1;
			fact = factorial(n - 1) * n;
			return fact;
		}
	}
}

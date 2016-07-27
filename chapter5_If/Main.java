package chapter5_If;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// swap(5, 4);
		// sign(-10, 78);
		// System.out.println(threeNumbers(0, 78, -200));
		// digitLerres(1);
		// equation(2, 3, 1);
		// sumZero(5);
		System.out.println(addPoint(1));
	}

	// Task: if a is bigger than b, than swap them
	public static void swap(int a, int b) {
		System.out.println("a: " + a + " b: " + b);
		if (a > b) {
			int tmp;
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println("a: " + a + " b: " + b);
	}

	// Task: Find the sign of a/b without calculations
	public static void sign(double a, double b) {
		if (a >= 0 && b >= 0 || a <= 0 && b <= 0) {
			System.out.println("+");
		} else {
			System.out.println("-");
		}
	}

	// Task: Find the biggest number of three numbers
	public static int threeNumbers(int a, int b, int c) {
		int max = Math.max(a, b);
		max = Math.max(max, c);
		return max;
	}

	// Task: Print the number with letters
	public static void digitLerres(int a) {
		switch (a) {
		case 0:
			System.out.println("нула");
			break;
		case 1:
			System.out.println("едно");
			break;
		case 2:
			System.out.println("две");
			break;
		case 3:
			System.out.println("три");
			break;
		case 4:
			System.out.println("четири");
			break;
		case 5:
			System.out.println("пет");
			break;
		case 6:
			System.out.println("шест");
			break;
		case 7:
			System.out.println("седем");
			break;
		case 8:
			System.out.println("осем");
			break;
		case 9:
			System.out.println("девет");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

	// Task: Find the roots of quadratic equation
	public static void equation(int a, int b, int c) {
		int D = b * b - 4 * a * c;
		if (D < 0) {
			System.out.println("There isn\t any real roots");
		} else {
			double x1 = (-b + Math.sqrt(D)) / (2.0 * a);
			double x2 = (-b - Math.sqrt(D)) / (2.0 * a);
			System.out.println("x1: " + x1 + " x2: " + x2);
		}
	}

	// Task: Find the numbers, which sum is zero
	public static void sumZero(int n) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(input.nextInt());
		}
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(j) + arr.get(i) == 0) {
					System.out.println(arr.get(i) + " " + arr.get(j));
				}
			}
		}
	}

	// Task: add points to a player - if his points are between 1 and 3 *= 10,
	// between 4 and 6 *= 100, between 7 and 9 *=1000 else print error message
	public static int addPoint(int points) {
		if (points < 1 || points > 9) {
			System.out.println("Wrong points");
			return 0;
		}
		if (points <= 3) {
			return points * 10;
		} else if (points <= 6) {
			return points * 100;
		} else {
			return points * 1000;
		}
	}

}

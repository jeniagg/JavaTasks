package chapter3_OperatorsAndExpressions;

import java.util.Scanner;

public class Gravitation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int weight = scanner.nextInt();
		System.out.println(gravitation(weight));

	}

	public static double gravitation(int weight) {
		if (weight <= 0) {
			System.out.println("Wrong input");
			return 0;
		}
		double inTheMoon = weight * 0.17;
		return inTheMoon;
	}

}

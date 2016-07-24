package chapter3_OperatorsAndExpressions;

public class Trapezoid {

	public static void main(String[] args) {
		System.out.println(trapezoidS(7 ,3, 2));

	}

	public static int trapezoidS(int a, int b, int h) {
		if (a <= 0 || b <= 0 || h <= 0) {
			System.out.println("Wrong input");
			return 0;
		}
		int s = ((a + b) * h) / 2;
		return s;
	}

}

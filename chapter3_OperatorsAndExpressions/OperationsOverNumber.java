package chapter3_OperatorsAndExpressions;

public class OperationsOverNumber {

	public static void main(String[] args) {
		number(1234);
	}

	public static void number(int num) {
		int a = (num / 1000) % 10;
		int b = (num / 100) % 10;
		int c = (num / 10) % 10;
		int d = num % 10;
		int result = a + b + c + d;
		System.out.println("Result is " + result);
		System.out.println(d + "" + c + b + a);
		System.out.println("" + d + a + b + c);
		System.out.println("" + a + c + b + d);
	}

}

package chapter3_OperatorsAndExpressions;

public class IsOdd {
	
	public static void main(String[] args) {
		System.out.println(isOdd(4));
		System.out.println(isOdd(5));
	}
	
	public static boolean isOdd(int number) {
		if(number % 2 != 0) {
			System.out.println("It is odd");
			return true;
		}
		System.out.println("It is even");
		return false;
	}
}

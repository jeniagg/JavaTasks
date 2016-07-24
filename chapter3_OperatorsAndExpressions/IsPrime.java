package chapter3_OperatorsAndExpressions;

public class IsPrime {

	public static void main(String[] args) {
		// task13: Is the number Prime?
		System.out.println(isPrime(100));
		System.out.println(isPrime(17));

	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0 ) {
				return false;
			}
		}
		return true;
	}

}

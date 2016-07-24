package chapter3_OperatorsAndExpressions;

public class IsDevidedBy5And7 {

	public static void main(String[] args) {
		System.out.println(devided(35));
		System.out.println(devided(30));

	}
	
	public static boolean devided(int number) {
		if (number % 7 == 0 && number % 5 == 0) {
			return true;
		}
		return false;
	}

}

package chapter3_OperatorsAndExpressions;

public class CheckThirdDigit7 {

	public static void main(String[] args) {
		System.out.println(thirdDigit7(123456));
		System.out.println(thirdDigit7(456789));

	}
	
	public static boolean thirdDigit7(int number) {
		int a = ( number / 100 ) % 10;
		if (a == 7) {
			return true;
		} 
		return false;
	}

}

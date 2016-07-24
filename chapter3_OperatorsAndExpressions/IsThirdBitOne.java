package chapter3_OperatorsAndExpressions;

public class IsThirdBitOne {

	public static void main(String[] args) {
		System.out.println("the third bit of 12 is " + thirdBit(12));
		System.out.println("the third bit of 112 is " + thirdBit(112));
	}

	public static byte thirdBit(int number) {
		if ((number & 4) == 0) {
			return 0;
		}
		return 1;
	}

}

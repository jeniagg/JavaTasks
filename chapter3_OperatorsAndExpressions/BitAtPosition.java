package chapter3_OperatorsAndExpressions;

public class BitAtPosition {

	public static void main(String[] args) {
		bitAtPosition(35, 7);
		bitAtPosition(1, 1);
		System.out.println(bitValue(35, 2, 1));
		System.out.println(bitValue(35, 5, 0));

	}

	public static int bitAtPosition(int number, int position) {
		int mask = 1 << position - 1;
		if ((number & mask) > 0) {
			System.out.println("the bit at position " + position + " is 1");
			return 1;
		} else {
			System.out.println("the bit at position " + position + " is 0");
			return 0;
		}
	}

	public static int bitValue(int number, int position, int value) {

		if (value == 0) {
			int mask = 1 << position;
			mask--;
			mask = 1 << position;
			return number & (~mask);
		} else {
			int m = 1 << position;
			return number | m;
		}

	}

}

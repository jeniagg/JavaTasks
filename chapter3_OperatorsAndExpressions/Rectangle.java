package chapter3_OperatorsAndExpressions;

public class Rectangle {

	public static void main(String[] args) {
		rectangle(3, 4);
		rectangle(-1, 0);

	}
	
	public static void rectangle(int a, int b) {
		if ( a <= 0 || b <= 0) {
			System.out.println("Wrong input");
			throw new IllegalArgumentException();
		}
		int s = a * b;
		int p = 2*(a + b);
		System.out.println("P: " + p + " S: " + s);
	}

}

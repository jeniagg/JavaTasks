package chapter3_OperatorsAndExpressions;

public class PointInCircle {

	public static void main(String[] args) {
		System.out.println(pointInCircle(0, 15));
		System.out.println(pointInCircle(-4, 2));
		
		System.out.println(pointCircleRectangle(-2, 3));
		System.out.println(pointCircleRectangle(0,  4));

	}

	// Task: Checking if a point is in the circle K((0,0), 5)

	public static boolean pointInCircle(int x, int y) {
		if (x >= 5 || x <= -5 || y >= 5 || y <= -5) {
			return false;
		} else
			return true;
	}

	// Checking if a point is in the circle K((0,0), 5), but also outside the
	// rectangle ((-1, 1), (-5, 5))
	
	public static boolean pointCircleRectangle(int x, int y) {
		if (pointInCircle(x, y)) {
			if (x < -1 || x > 1) {
				return true;
			}
			return false;
		}
		return false;
	}

}

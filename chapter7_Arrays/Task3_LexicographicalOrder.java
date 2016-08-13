package chapter7_Arrays;

public class Task3_LexicographicalOrder {

	public static void main(String[] args) {
		// Task: Compare two char arrays lexicographically (Case Sensitive)
		char[] arrFirst = { 'c', 'b' };
		char[] arrSecond = { 'a', 'b' };
		int minLenght = arrFirst.length;
		if (arrSecond.length < minLenght) {
			minLenght = arrSecond.length;
		}
		String str = "";
		for (int i = 0; i < minLenght; i++) {
			if (arrFirst[i] < arrSecond[i]) {
				str = "first";
				break;
			} else if (arrFirst[i] > arrSecond[i]) {
				str = "second";
				break;
			}
		}
		if (str.length() == 0) {
			if (arrFirst.length < arrSecond.length) {
				System.out.println("first array");
			} else if (arrFirst.length > arrSecond.length) {
				System.out.println("second array");
			} else
				System.out.println("Two arrays are identical");
		} else {
			System.out.println(str + " array");
		}
	}

}

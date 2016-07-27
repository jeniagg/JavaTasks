package chapter5_If;

public class NumberNames {

	public static void main(String[] args) {
		// Task: Input a number [0;999] and print its name
		System.out.println(name(256));
	}

	public static String digit(int digit) {
		switch (digit) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return null;
		}
	}

	public static String teen(int teen) {
		switch (teen) {
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			return null;
		}
	}

	public static String tens(int tens) {
		switch (tens) {
		case 1:
			return "ten";
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "fourty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return null;
		}
	}

	public static String name(int number) {
		int digit = number % 10;
		int tens = (number / 10) % 10;
		int hundreds = number / 100;
		int special = number % 100;
		String name = "";

		if (hundreds > 0) {
			name += digit(hundreds) + " hundred ";
		}
		if (special > 10 && special < 20) {
			if (hundreds > 0) {
				name += " and ";
			}
			name += teen(special);
		} else {
			if (tens > 0) {
				if (hundreds > 0) {
					name += " and ";
				}
				name += tens(tens);
			}
			if (digit > 0) {
				if (tens == 0 && hundreds > 0) {
					name += "and";
				}
				name += " " + digit(digit);
			}
		}
		return name;
	}

}

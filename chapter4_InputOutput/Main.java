package chapter4_InputOutput;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// System.out.println(result());
		// circle();
		// firm();
		// System.out.println(numberCount());
		// biggerNumber();
		System.out.println(fiveNumbers());

	}

	// Task: return a + b + c, when the input is from the console
	public static int result() {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please, write 3 numbers:");
		for (int i = 0; i < 3; i++) {
			sum += input.nextInt();
		}
		return sum;

	}

	// Task: Read the radius of a circle and output its perimeter and area
	public static void circle() {
		System.out.println("Please, enter the radius");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double p = 2 * Math.PI * r;
		double s = Math.PI * r * r;
		System.out.println("The perimeter is: " + p + " and the area is: " + s);
	}

	// Task: Information about the firm - read it and print it
	public static void firm() {
		Scanner input = new Scanner(System.in);
		System.out.println("name: ");
		String name = input.nextLine();
		System.out.println("adress: ");
		String address = input.nextLine();
		System.out.println("phone: ");
		String phone = input.nextLine();
		System.out.println("fax: ");
		String fax = input.nextLine();
		System.out.println("web sait: ");
		String sait = input.nextLine();
		System.out.println("Manager's name: ");
		String manager = input.nextLine();
		System.out.println("Manager's last name: ");
		String managerLastName = input.nextLine();
		System.out.println("Manager's phone: ");
		String managerPhone = input.nextLine();
		System.out.println("The firm's name is " + name
				+ " and its address is " + address
				+ ". You can conntact with it in two ways, the phone is: "
				+ phone + " and the fax is: " + fax + ". The web sait is "
				+ sait + ". The manager's name is " + manager
				+ " and his last name is " + managerLastName
				+ ". You can conntact with him/her on the following phone: "
				+ managerPhone);
	}

	// Task: the count of the numbers, which are divided by 5, between two
	// numbers
	public static int numberCount() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		if (a > b) {
			int tmp;
			tmp = a;
			a = b;
			b = tmp;
		}
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				count++;
			}
		}
		return count;
	}

	// Task: Print the bigger number without using comparison
	public static void biggerNumber() {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		double res = ((a + b) + Math.abs(b - a)) / 2.0;
		System.out.println((int) res);
	}

	// Task: Find the biggest number within five numbers
	public static int fiveNumbers() {
		Scanner input = new Scanner(System.in);
		int[] arr = { 0, 0, 0, 0, 0 };
		int max = input.nextInt();
		for (int i = 0; i < 4; i++) {
			arr[i] = input.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}

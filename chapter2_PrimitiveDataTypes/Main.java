package chapter2_PrimitiveDataTypes;

public class Main {

	public static void main(String[] args) {
		// Task One: The best data types for this numbers 52130; -115; 4825932;
		// 97; -10000.
		int a = 52130;
		byte b = -115;
		int c = 4825932;
		byte d = 97;
		short e = -10000;

		// Task Two: double or float: 34.567839023; 12.345; 8923.1234857;
		// 3456.091
		double f = 34.567839023;
		float g = 12.345f;
		float h = 8923.1234857f;
		float i = 3456.091f;

		// Task 3: Declare integer with value 256 in hex
		int var = 0x100;
		System.out.println(var);

		// Task 4: Declare a boolean variable isMale and set it true or false -
		// for your gender
		boolean isMale = false;
		System.out.println(isMale);

		// Task5: Create string "Hello" and string "World" concatenate them and
		// assign the value to object type and then assign the Object variable
		// to String variable
		String hello = "Hello";
		String world = "World";
		Object result = hello + " " + world;
		System.out.println(result);
		String stringRes = (String) result;

		// Task 6: Print to the console: The "use" of quotations causes
		// difficulties (you should assign it to a variable first)
		String msg = "The \"use\" of quotations causes difficulties";
		System.out.println(msg);

		// Task7: draw isosceles triangle created of *
		String triangle = "  *  \n * * \n* * *";
		System.out.println(triangle);

		// Task 8: draw a heart created of o
		String heart = "  o o o o\n o   o   o\n  o     o\n   o   o \n     o  ";
		System.out.println(heart);

		// Task 9: Use correct variable types for person first name, last name,
		// age, gender ('m', 'f'), and id (from 27560000 to 27569999)

		String firstName;
		String lastName;
		byte age;
		char gender;
		int id;

		// Task 10: swap values of a and b
		int x = 5;
		int y = 10;
		int temp;

		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + " y: " + y);

	}

}

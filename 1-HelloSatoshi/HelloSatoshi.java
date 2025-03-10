/*
- Statements require a semicolon (;) but classes don't
- File name must match the class name
- The main method is a must
*/
public class HelloSatoshi {
	public static void main(String[] args) {
		System.out.println("Hello, Satoshi Nakamoto!"); // Prints and adds a new line
		System.out.println("Thank you!");
		System.out.print("#"); // Prints in a new line because previous statement added a new line
		System.out.print("Bitcoin"); // Prints without new line

		int a = 12;
		double b = 13.1; // Decimal numbers but also bigger int numbers

		String c = "string";
		char d = 'D'; // Single characters WITH single quotes ('')

		boolean e = true;

		System.out.println();
		System.out.println(a);
	}
}
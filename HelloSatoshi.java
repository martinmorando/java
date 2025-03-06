/*
- Statements require a semicolon (;) but classes don't
- File name must match the class name
- The main method is a must

- Compile: `javac HelloSatoshi.java`
- Run: 	   `java HelloSatoshi` (despite ending in .class)
*/

public class HelloSatoshi {
	public static void main(String[] args) {
		System.out.println("Hello, Satoshi Nakamoto!"); // Prints and adds a new line
		System.out.println("Thank you!");
		System.out.print("#"); // Prints in a new line because previous statement added a new line
		System.out.print("Bitcoin"); // Prints without new line
	}
}
public class Numbers {
	public static void main(String[] args) {

		int a = 7;
		int b = 2;
		
		boolean isABigger = a > b;
		System.out.println(isABigger);

		// ATTENTION: integer division only. Prints 3, not 3.5
		// The remainder is lost. "Floors" it
		int c = a / b;
		System.out.println(c);

		// Final
		final int coins = 21000000;
		// coins += 1; // Error

	}
}
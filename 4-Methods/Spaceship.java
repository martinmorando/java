/*
	Methods
*/
public class Spaceship {

	// Default values, can be overwritten with constructor
	public String name = "Sky";
	public int countdown = 10;
	public boolean isReady = false;

	// Constructor needs same name as the class
	public Spaceship(String spaceshipName, int spaceshipCountdown, boolean spaceshipIsReady) {
		name = spaceshipName;
		countdown = spaceshipCountdown;
		isReady = spaceshipIsReady;
	}

	// Another constructor
	public Spaceship(String spaceshipName) {
		name = spaceshipName;
	}

	// String representation of the object
	// A special method that prints custom message instead of object name and position in memory
	public String toString() {
		return "I'm " + name;
	}

	// Method to change spaceship name
	public void changeName(String newName) {
		name = newName;
	}

	// Return current countdown
	public int currentCountdown() {
		return countdown;
	}

	public static void main(String[] args) {

		Spaceship curiosity = new Spaceship("Curiosity & Beyond", 5, true); // Uses first constructor
		System.out.println(curiosity.name);
		curiosity.changeName("Curiosity & Beyond Inc.");
		System.out.println(curiosity); // Prints new name
		
		Spaceship conquer = new Spaceship("Conquer Enterprises"); // Uses second constructor
		System.out.println(conquer.name);
		System.out.println(curiosity.currentCountdown() + " days to liftoff.");

	}

}
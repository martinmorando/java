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

	public static void main(String[] args) {		
		Spaceship curiosity = new Spaceship("Curiosity & Beyond", 5, true); // Uses first constructor
		System.out.println(curiosity.name);
		
		Spaceship conquer = new Spaceship("Conquer Enterprises"); // Uses second constructor
		System.out.println(conquer.name);
	}

}
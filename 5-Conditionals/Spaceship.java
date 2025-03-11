/*
	Conditionals 
*/
public class Spaceship {

	public String name = "Sky";
	public int countdown = 10;
	public boolean isReady = false;
	public String pilot;

	public Spaceship(String spaceshipName, int spaceshipCountdown, boolean spaceshipIsReady) {
		name = spaceshipName;
		countdown = spaceshipCountdown;
		isReady = spaceshipIsReady;
	}

	public Spaceship(String spaceshipName) {
		name = spaceshipName;
	}

	public String toString() {
		return "I'm " + name;
	}

	public void changeName(String newName) {
		name = newName;
	}

	public int currentCountdown() {
		return countdown;
	}

	/* - New method to demonstrate conditionals and logic
	   - Logical operators: &&, ||, !
	   - Very similar to PHP, but in Java:
			- can't use "or", "and"
			- only use "else if", not "elseif"
			- identical operator is == (remember strings use .equal), not === 
	*/
	public void setPilot(String pilotName) {

		// Simple conditional
		if ((pilotName.equals("van Gogh")) || (pilotName.equals("Rembrandt"))) {
			pilot = pilotName;
			System.out.println("The pilot for " + name + " is now " + pilot);	
		} else {
			System.out.println(pilotName + " is not part of the company.");
		}

		// This is also valid in Java, no {}
		if (pilotName == "Neo")
			System.out.println("You found an easter egg!");

		// Ternary operator
		String tempDemo = pilotName.equals("Neo") ? "It's Neo." : "It's not Neo";
		System.out.println("Ternary operator: " + tempDemo);

		// Switches are very similar to PHP
		switch (pilotName) {
			case "Neo":
				System.out.println("Switch: It's Neo, again!");
				break;
			default:
				System.out.println("Switch: Nope, it's not Neo.");
				break;				
		}

	}

	public static void main(String[] args) {

		Spaceship curiosity = new Spaceship("Curiosity & Beyond", 5, true);
		curiosity.changeName("Curiosity & Beyond Inc.");

		// Use new method
		curiosity.setPilot("Rembrandt");
		curiosity.setPilot("Mickey Mouse");
		curiosity.setPilot("Neo");

	}

}
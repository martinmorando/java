/*
    Static/Ship
    - Static variables and static methods are related to the class, not to a specific object
    - Static variables can be accessed from both static and non-static methods
    - Static methods can't access non-static variables (can't use "this") 
*/

public class Ship {

    // Declare an instance variable (non-static variable)
    public String name;

    // Declare and assing static variables
    static boolean hasAnchor = true;
    static int totalShips = 0;

    // Constructor
    public Ship(String newName) {
        // Assign an instance variable
        this.name = newName;

        // Increment a static variable
        totalShips += 1;
    }

    // Non-static method
    public void printShipName() {
        System.out.println("This ship name is: " + this.name);
    }

    // Static method
    public static int getTotalShips() {
        return totalShips;
    }

    public static void main(String[] args) {

        Ship blackPearl = new Ship("Black Pearl");

        // Output instance variable (related to a specific ship)
        System.out.println(blackPearl.name);      // "Black Pearl"

        // Output static variable (related to the class, shared by all ships)
        System.out.println(Ship.hasAnchor);       // true

        // Output static variable through the instance
        System.out.println(blackPearl.hasAnchor); // true


        Ship flyingDutchman = new Ship("Flying Dutchman");

        // Output a non-static variable using a non-static method
        flyingDutchman.printShipName();           // This ship name is: Flying Dutchman

        // Output a static variable using a static method
        System.out.println(Ship.getTotalShips()); // 2

        // This is wrong
        // Compilation error: "non-static variable this cannot be referenced from a static context"
        // System.out.println(this.totalShips);

    } 

}
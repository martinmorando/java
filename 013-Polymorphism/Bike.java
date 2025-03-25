/*
    Polymorphism/Bike
*/

// The Bike class is a subclass of the Vehicle class
public class Bike extends Vehicle {

    public Bike() {
        // Set yearManufactured for each new bike as 2001
        // Call the constructor of the super class
        super(2001);
    }

    // This class has its own implementation of drive()
    @Override
    public void drive() {
        System.out.print("---25km/h--->");
    }

}
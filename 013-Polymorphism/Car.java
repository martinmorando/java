/*
    Polymorphism/Car
*/

// The Car class is a subclass of the Vehicle class
public class Car extends Vehicle {

    public Car() {
        // Set yearManufactured for each new car as 1999
        // Call the constructor of the super class
        super(1999);
    }

    // This class has its own implementation of drive()
    @Override
    public void drive() {
        System.out.print("---100km/h--->");
    }

}
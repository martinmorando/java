/*
    Polymorphism/Main
*/

public class Main {

    public static void main(String[] args) {

        // Create a Car object
        Vehicle myCar = new Car();
        // Calls the overriden drive() method in the Car class
        // instead of the drive() method in the Vehicle class (parent class).
        myCar.drive();      // ---100km/h--->

        // Create a Bike object
        Vehicle myBike = new Bike();
        myBike.drive();     // ---25km/h--->



        // Then, if drive() is overriden in every subclass, what's the purpose
        // of drive() in Vehicle? One reason (at least) is the following:

        Vehicle[] vehicles = {myCar, myBike};
        
        // Call the appropriate drive() method for each vehicle
        for ( Vehicle v : vehicles ) {
            v.drive();
        }                   // ---100km/h--->---25km/h--->



    }
    
}
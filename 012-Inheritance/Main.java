/*
    Inheritance/Main
    - The class Vehicle is the "parent class", "superclass" or "base class".
    - The class Car is the "child class", "subclass" or "derived class".
    - Car inherits traits (characteristics and behaviors, or instance variables
      and methods) from Vehicle.
*/

public class Main {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle(2024);
        System.out.println(myVehicle.companyName);  // Output: KeepGoing Inc.

        Car myCar = new Car();
        System.out.println(myCar.companyName);      // Output: KeepGoing Inc.
        System.out.println(myCar.yearManufactured); // Output: 1999

    }
    
}
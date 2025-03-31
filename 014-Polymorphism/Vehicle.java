/*
    Polymorphism/Vehicle
*/

public class Vehicle {

    // All vehicles are from the same company
    String companyName = "Keep Going Inc.";
    int yearManufactured;

    public Vehicle(int newYear) {
        this.yearManufactured = newYear;
    }

    public void drive() {
        System.out.print("---5km--->");
    }
    
}
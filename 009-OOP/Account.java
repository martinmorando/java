/*
    OOP/Account
*/

public class Account {

    private double balance; // Private instance variable

    // Constructor
    public Account(double newBalance) {
        this.balance = newBalance;
    }

    // Accessor method (AKA getter)
    public double getBalance() {
        return this.balance;
    }
 

}
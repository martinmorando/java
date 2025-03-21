/*
    OOP/Bank
*/

public class Bank {
    
    public static void main(String[] args) {

        Account myAccount = new Account(15000000000.00);  // To become Batman, of course 
        
        // System.out.println(myAccount.balance);         // This won't compile because balance is private

        // Instead, use a getter
        System.out.println( myAccount.getBalance() );

    }

}
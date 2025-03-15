/*
	Strings
*/

public class Strings {
    
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Bye";

        // Use .equals to compare, not ==
        // Reason: String is an object, not a primitive type
        System.out.println( a.equals(b) );

        // Concatenation
        System.out.println(a + " " + b);

        // Concatenation with an integer. Can mix string and int directly
        int num = 21;
        System.out.println(a + " " + num);


    }

}
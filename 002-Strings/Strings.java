/*
	Strings
    - In Java, a String is an object, not a primitive type
*/

public class Strings {
    
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Bye";

        // [Concatenation]
        // - Concatenation with strings
        System.out.println(a + " " + b);        // "Hello Bye"

        // - Concatenation with an integer. Can mix string and int directly
        int num = 21;
        System.out.println(a + " " + num);      // "Hello 21"


        // [Built-in methods]
        System.out.println( a.length() );       // 5
        System.out.println( a.toLowerCase() );  // "hello"
        System.out.println( a.toUpperCase() );  // "HELLO"

        // IMPORTANT: As Strings is an object, use .equals to compare, not ==
        System.out.println( a.equals(b) );                  // false
        System.out.println( a.equalsIgnoreCase("hello") );  // true

        // IMPORTANT: concat() does not changes the object
        // Remember: strings are immutable objects 
        System.out.println( a.concat(b) );      // "HelloBye"

        // Returns index of first match
        System.out.println( a.indexOf("e") );   // 1
        System.out.println( a.indexOf("llo") ); // 2

        // Returns character from specified index
        System.out.println( a.charAt(1) );      // "e"

        // Extract a substring from a string
        // - From specified index to the end 
        System.out.println( a.substring(1) );   // "ello"

        // - From specified index to another specified index
        System.out.println( a.substring(1,3) ); // "el"

    }

}
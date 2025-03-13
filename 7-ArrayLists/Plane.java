/*
    ArrayLists
    - dynamic size (its size can be changed)
*/

import java.util.ArrayList;

public class Plane {

    public static void main(String[] args) {

        // Declare and initialize an empty ArrayList that will contain strings
        ArrayList<String> letters = new ArrayList<String>();

        // Declare an empty ArrayList that will contain integers...
        ArrayList<Integer> numbers;
        // ... and initialize the array
        numbers = new ArrayList<Integer>();

        // <> symbols are used for "generics". In between <> goes the type of ArrayList
        // This is why it's not possible to use primitive types (int, double, char)
        // Instead, use <Integer>, <Double>, <Character>

        // Add one item. Only accepts same data type as when created
        letters.add("A");
        letters.add("B");
        letters.add("C");

        // Access item by index
        letters.get(0);

        // Get index from value
        letters.indexOf("A");

        // Change value by index
        letters.set(0, "AAA");

        // Remove item by index
        letters.remove(1);
        // Remove item by value
        letters.remove("C");

        // Number of items
        System.out.println( letters.size() );

        System.out.println( letters );

        /*
            Create an empty array that will hold different data types
            Items are treated as objects, so some methods won't apply
            It's not recommended; the compiler warns: "Plane.java uses unchecked or unsafe operations" 
        
        ArrayList stuff = new ArrayList<>();
        stuff.add("1");
        stuff.add(5);
        stuff.add(true);
        */

    }

}
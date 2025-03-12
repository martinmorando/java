/*
    Arrays are 0-indexed in Java
    - Size (number of items) can't be changed
*/
import java.util.Arrays;

public class Hotel {

    public static void main(String[] args) {

        // Create an int array
        int[] sizes;

        // Create an empty string array with 3 elements ("initialize")
        // Default value: null
        String[] name = new String[3];

        // Creat an empty boolean array with 5 elements
        // Default value: false
        boolean[] isRaining = new boolean[5];

        // Create an empty integer array with 10 elements
        // Default value: 0
        int[] numbersA = new int[10];

        // Create an empty double array with 2 elements
        // Default value: 0.0
        double[] numbersB = new double[2];

        // Create an int array with known elements ("explicitly")        
        int[] numbersC = {1, 3, 6, 9};

        // Access 3rd value
        System.out.println( numbersA[2] );

        // Replace 3rd value
        numbersC[2] = 45;

        // Print array (only prints memory address)
        System.out.println( numbersC );

        // Print array with its elements using toString() method from Arrays package 
        // java.util.Arrays must be imported
        System.out.println( Arrays.toString(numbersC) );

        // Print length (number of items)
        System.out.println( numbersC.length );
        
        /*
            About the "String[] args" parameter in the main method: 
            - this declares a string array named "args" that holds command-line arguments
            - access the first argument using args[0]. For example, when executing:
                  java Hotel asd
              "asd" would be the first argument (args[0])
            - check the length of the array before accesing its elements. 
              If no argument is passed, Java throws an error at runtime 
        */
        if ((args.length != 0) && (args[0].equals("covfefe"))) {
            System.out.println("Valid nuclear code. Tweet 'y' to launch.");            
        }

    }

}
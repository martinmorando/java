/*
    Loops
*/

import java.util.Arrays;
import java.util.ArrayList;

public class Plane {
    
    public static void main(String[] args) {

        int n = 10;

        // For loop is identical to PHP's
        for (int i=0; i<n; i++) {
            System.out.println( "For loop: " + i );
        }


        // While loop is identical to PHP's
        int i = 0;
        while (i < n) {
            System.out.println( "While loop: " + i );
            i++;
        }


        // Iterate over an array
        int[] numbers = {21, 22, 23, 24};
        for (int c=0; c<numbers.length; c++) {
            System.out.println( "Array: " + numbers[c] );
        }


        // Iterate over an ArrayList 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8));
        for (int d=0; d<list.size(); d++) {
            System.out.println( "ArrayList: " + list.get(d) );
        }
        
    }

}
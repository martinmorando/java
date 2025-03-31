/*
    Two-dimensional Arrays
    - Fixed size.
    - Default values for int arrays: 0.
    - Each row can have a different number of columns ("jagged arrays").
*/

public class Ship {
    public static void main(String[] args) {

        // [CREATE]
        // - Initialize an empty 2D array with 3 rows and 2 columns
        int[][] a;
        a = new int[3][2];

        // - Declare and assign 2D array with 2 rows and 3 columns
        int[][] b = {{1, 2, 3}, {4, 5, 6}};

        // - Same, but more visual
        int[][] c = {
            {1, 2, 3},
            {4, 5, 6}
        };


        // [ACCESS ELEMENTS]
        // - Print 1st row, 3rd column
        System.out.println(c[0][2]);    // Output: 3


        // [LENGTH]
        // - Rows
        System.out.println(c.length);   // Output: 2
        // - Columns
        System.out.println(c[0].length);// Output: 3


        // [JAGGED ARRAY]
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5, 6}
        };

    }
}
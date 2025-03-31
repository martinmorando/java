/*
    Math/Calculator
    - If the Math class is imported, there is no need to use "Math." when
    using its methods.  
    - If the Math class is not imported, it is required to use "Math." when 
    using its methods.
    - In either case, why it's not required to create an instance of the class? 
    Because all its methods are "static".
*/

// Import the Math class, which is part of the java.lang package
import static java.lang.Math.*;

public class Calculator {

    public static void main(String[] args) {

        // Minimum value
        int a = Math.min(-12, 3);
        int b = min(-12, 3);                    // "Math." is not required really
        System.out.println(a);                  // -12

        // Absolute value
        int c = Math.abs(-12);
        System.out.println(c);                  // 12

        // Exponentiation
        double d = Math.pow(3, 2);
        System.out.println(d);                  // 9.0

        // Square root
        double e = Math.sqrt(9);
        System.out.println(e);                  // 3.0

    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

 /*
**Why We Use BigInteger:**
`BigInteger` is used in Java for representing and performing operations on integers that exceed the size limits of primitive data types like `int` and 
`long`. It supports arbitrarily large numbers, which makes it essential for applications requiring high precision calculations, such as cryptography, 
large-scale scientific computations, and financial calculations where rounding errors must be avoided.

**Why BigInteger Takes a String Parameter:**
The `BigInteger` constructor that accepts a `String` parameter allows for the creation of `BigInteger` objects from textual representations of numbers.
This approach is flexible because:

1. **Arbitrary Size**: A `String` can represent an integer of any length, allowing `BigInteger` to handle extremely large numbers without being 
limited by the fixed size of primitive types.

2. **Precision**: Strings accurately represent numbers without loss of precision, unlike floating-point types (`double`), which can lose precision with 
very large values.

3. **Convenience**: Users can input large numbers as text without worrying about the range limitations of numeric data types, making it easy to read, 
parse, and manipulate big integers.

Using a `String` ensures that the `BigInteger` class can safely and accurately represent any integer value, regardless of its size.
 */
package bigintegerexample;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author muska
 */
public class BigIntegerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a bigInteger digit"); //enter the first BigInteger and read the input
        String input1 = s.nextLine();
        System.out.println("Enter a bigInteger digit"); //enter the second BigInteger and read the input
        String input2 = s.nextLine();

        // Convert the string inputs to BigInteger objects
        BigInteger bigInteger1 = new BigInteger(input1);
        BigInteger bigInteger2 = new BigInteger(input2);

        BigInteger sum = bigInteger1.add(bigInteger2);
        System.out.println("Sum: " + sum);                  //the sum of the two BigIntegers

        BigInteger sub = bigInteger1.subtract(bigInteger2);
        System.out.println("Subtraction: " + sub);          //difference between the two BigIntegers

        BigInteger mul = bigInteger1.multiply(bigInteger2);
        System.out.println("Multiplication" + mul);         //product of the two BigIntegers
        try {

            BigInteger div = bigInteger1.divide(bigInteger2);
            System.out.println("divide: " + div);           //the division of the two BigIntegers
        } catch (Exception e) { //// Handle division by zero
            System.out.println("The BigInteger cannot be zero for division.");
        }

        BigInteger and = bigInteger1.and(bigInteger2);     
        System.out.println("And Operator: " + and);         //bitwise AND of the two BigIntegers

        System.out.println("Enter a bigInteger digit");     //enter an exponent and read the input
        int exponent = s.nextInt();

        BigInteger pow = bigInteger1.pow(exponent);
        System.out.println("Power: " + pow);                //result of raising the first BigInteger to the power of the exponent

    }

}
/*
      ------------------------OUTPUT---------------------------------------------
        OUTPUT-1:
Enter a bigInteger digit
2322321
Enter a bigInteger digit
112112
Sum: 2434433
Subtraction: 2210209
Multiplication260360051952
divide: 20
And Operator: 75152
Enter a bigInteger digit
4
Power: 29086334715028720264815681
BUILD SUCCESSFUL (total time: 10 seconds)

        OUTPUT-2:
Enter a bigInteger digit
46451
Enter a bigInteger digit
0
Sum: 46451
Subtraction: 46451
Multiplication0
The BigInteger cannot be zero for division.
And Operator: 0
Enter a bigInteger digit
5
Power: 216259572299858281257251
BUILD SUCCESSFUL (total time: 13 seconds)


*/
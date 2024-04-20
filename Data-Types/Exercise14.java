// 14. Write a Java program to extract the primitive type value from a given BigInteger value.
// A primitive type is predefined by the language and is named by a reserved keyword. 
// Primitive values do not share state with other primitive values. The eight primitive data types supported by the Java programming language are byte, short, int, long, float, double, Boolean and char.
// BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger.
// The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive. 
// The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element. 
// A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1.

import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter BigInteger: ");
        BigInteger bigInt = BigInteger.valueOf(sc.nextLong());
        System.out.println("BigInteger value: ");
        long longVal = bigInt.longValue();
        int intVal = bigInt.intValue();
        short shortVal = bigInt.shortValue();
        byte byteVal = bigInt.byteValue();
        long exactVal = bigInt.longValueExact();
        System.out.println("BigInteger to long: "+longVal);
        System.out.println("BigInteger to int: "+intVal);
        System.out.println("BigInteger to short: "+shortVal);
        System.out.println("BigInteger to byte: "+byteVal);
        System.out.println("BigInteger to exact: "+exactVal);
    }
}

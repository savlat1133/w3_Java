// 20. Write a Java program to convert a decimal number to a hexadecimal number.
// Input Data:
// Input a decimal number: 15
// Expected Output

// Hexadecimal number is : F 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        int decimal = sc.nextInt();

        System.out.println("Sum of two binary numbers: " + Integer.toHexString(decimal).toUpperCase());
    }
}

// 21. Write a Java program to convert a decimal number to an octal number.
// Input Data:
// Input a Decimal Number: 15
// Expected Output

// Octal number is: 17  

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        int decimal = sc.nextInt();

        System.out.println("Sum of two binary numbers: " + Integer.toOctalString(decimal));
    }
}

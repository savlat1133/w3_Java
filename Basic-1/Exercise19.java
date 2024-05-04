// 19. Write a Java program to convert an integer number to a binary number.
// Input Data:
// Input a Decimal Number : 5
// Expected Output

// Binary number is: 101 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        int decimal = sc.nextInt();

        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(decimal));
    }
}

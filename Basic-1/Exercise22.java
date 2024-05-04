// 22. Write a Java program to convert a binary number to a decimal number.
// Input Data:
// Input a binary number: 100
// Expected Output

// Decimal Number: 4 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.parseInt(decimal, 2));
    }
}

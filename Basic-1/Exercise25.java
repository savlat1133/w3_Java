// 25. Write a Java program to convert a octal number to a decimal number.
// Input Data:
// Input any octal number: 10
// Expected Output

// Equivalent decimal number: 8

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.parseInt(decimal, 8));
    }
}

// 6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

// Test Data
// Input floating-point number: 25.586
// Input floating-point another number: 25.589
// Expected Output :
// They are different

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first floating-point number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second floating-point number: ");
        double num2 = sc.nextDouble();

        // Round the numbers to three decimal places
        double roundedNum1 = Math.round(num1 * 1000.0) / 1000.0;
        double roundedNum2 = Math.round(num2 * 1000.0) / 1000.0;

        // Compare the rounded numbers
        if (roundedNum1 == roundedNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }
        sc.close();
    }
}

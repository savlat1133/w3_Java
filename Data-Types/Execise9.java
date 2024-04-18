// 9. Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

// Test Data
// Input 1st integer: 25
// Input 2nd integer: 5
// Expected Output :
// Sum of two integers: 30
// Difference of two integers: 20
// Product of two integers: 125
// Average of two integers: 15.00
// Distance of two integers: 20
// Max integer: 25
// Min integer: 5

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input 1st integer: ");
        int a = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int b = sc.nextInt();
        System.out.printf("\nSum of two integers: %d", a + b);
        System.out.printf("\nDifference of two integers: %d", a - b);
        System.out.printf("\nProduct of two integers: %d", a * b);
        System.out.printf("\nAverage of two integers: %.2f", ((a+b) / 2.0));
        System.out.printf("\nDistance of two integers: %d", Math.abs(a - b));
        System.out.printf("\nMax integer: %d", Math.max(a, b));
        System.out.printf("\nMin integer: %d", Math.min(a, b));
    }
}

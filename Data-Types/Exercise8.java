// 8. Write a Java program that reads a number and displays the square, cube, and fourth power.

// Expected Output:
// Square: .2f
// Cube: .2f
// Fourth power: 50625.00

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the side length value: ");
        double length = sc.nextDouble();
        System.out.printf("Square: %.2f\n", Math.pow(length, 2));
        System.out.printf("Cube: %.2f\n", Math.pow(length, 3));
        System.out.printf("Fourth power: %.2f\n", Math.pow(length, 4));
    }
}

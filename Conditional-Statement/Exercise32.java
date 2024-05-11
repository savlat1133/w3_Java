// 32. Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.

// Test Data
// Input first floating­point number: 1235
// Input second floating­point number: 2534
// Expected Output :

// These numbers are different.

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first floating point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second floating point number: ");
        double num2 = sc.nextDouble();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }

}

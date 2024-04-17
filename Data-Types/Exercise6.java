// 6. Write a Java program to compute the body mass index (BMI).

// Test Data
// Input weight in pounds: 452
// Input height in inches: 72
// Expected Output:
// Body Mass Index is 61.30159143458721

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        System.out.print("Input height in inches: ");
        double heightInInches = sc.nextDouble();
        System.out.printf("Body Mass Index is %f", (weightInPounds/Math.pow(heightInInches, 2)*703));
    }
}

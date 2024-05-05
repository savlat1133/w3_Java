// 2. Write a Java method to compute the average of three numbers.
// Test Data:
// Input the first number: 25
// Input the second number: 45
// Input the third number: 65
// Expected Output:

// The average value is 45.0

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the 1st number: ");
        double first = sc.nextDouble();
        System.out.print("Input the 2nd number: ");
        double second = sc.nextDouble();
        System.out.print("Input the 3rd number: ");
        double third = sc.nextDouble();

        System.out.println("The smallest value: " + (first+second+third)/3);
    }
}

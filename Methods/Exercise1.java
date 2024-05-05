// 1. Write a Java method to find the smallest number among three numbers.
// Test Data:
// Input the first number: 25
// Input the Second number: 37
// Input the third number: 29
// Expected Output:

// The smallest value is 25.0

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

        System.out.println("The smallest value: " + Math.min(third,Math.min(first,second)));
    }
}

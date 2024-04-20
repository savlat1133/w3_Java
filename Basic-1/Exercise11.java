// 11. Write a Java program to print the area and perimeter of a circle.
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input radius: ");
        double radius = sc.nextDouble();
        System.out.println("Perimeter is = " + (2*Math.PI*radius));
        System.out.println("Area is = " + (Math.PI*Math.pow(radius,2)));
    }
}

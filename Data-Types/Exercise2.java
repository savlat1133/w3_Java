// 2. Write a Java program that reads a number in inches and converts it to meters.
// Note: One inch is 0.0254 meter.
// Test Data
// Input a value for inch: 1000
// Expected Output :
// 1000.0 inch is 25.4 meters

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        System.out.printf("%.1f inch is %,1f meters",inch,inch*0.0254);
    }
}

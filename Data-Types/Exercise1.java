// 1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
// Test Data
// Input a degree in Fahrenheit: 212
// Expected Output:
// 212.0 degree Fahrenheit is equal to 100.0 in Celsius

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a degree in Fahrenheit: ");
        double fah = sc.nextDouble();
        System.out.printf("\n%.1f degree Fahrenheit is equal to %.1f in Celsius", fah, convertFahToCel(fah));


    }

    public static double convertFahToCel(double fah){
        double cel = ((fah-32)*5)/9;
        return cel;
    }
}

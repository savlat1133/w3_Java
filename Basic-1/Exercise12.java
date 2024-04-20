// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\nInput 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("\nInput 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("\nInput 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println("Average is " + (num1+num2+num3)/3.0);
    }
}

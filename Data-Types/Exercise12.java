// 12. Write a Java program to compare two signed and unsigned numbers.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            System.out.print("Input a signed integer: ");
            int num1 = sc.nextInt();
            System.out.print("Input an unsigned integer: ");
            int num2 = sc.nextInt();
            System.out.println("Comparing signed numbers: " + Integer.compare(num1,num2));
            System.out.println("Comparing unsigned numbers: " + Integer.compareUnsigned(num1,num2));
    }
}

// 31. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

// Test Data
// Input first number: 1524
// Input second number: 2345
// Input third number: 3321
// Expected Output :

// Increasing order

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 < num2 && num2 < num3){
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        }else {
            System.out.println("Neither increasing or decreasing");
        }
    }
}

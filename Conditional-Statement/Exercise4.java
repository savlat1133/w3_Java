// 4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        double num = sc.nextDouble();
        if(num > 0){
            if(num < 1) {
                System.out.println("Positive small number");
            } else if (num > 1_000_000) {
                System.out.println("Positive large number");
            }else{
                System.out.println("Positive number");
            }
        } else if (num < 0) {
            if (num > -1){
                System.out.println("Negative small number");
            } else if (num < -1_000_000) {
                System.out.println("Negative large number");
            }else {
                System.out.println("Negative number");
            }
        }else {
            System.out.println("Zero");
        }
    }
}

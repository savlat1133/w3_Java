28. Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

Test Data
Input a number: -2534
Expected Output :

Negative

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        if(num < 0){
            if(num < -1_000_000) System.out.println("Negative large");
            else System.out.println("Negative small");
        } else if (num > 0){
            if(num > 1_000_000) System.out.println("Positive large");
            else System.out.println("Positive small");
        }else{
            System.out.println("Zero");
        }
    }

}

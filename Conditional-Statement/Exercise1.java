// 1. Write a Java program to get a number from the user and print whether it is positive or negative.

// Test Data
// Input number: 35
// Expected Output :

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}

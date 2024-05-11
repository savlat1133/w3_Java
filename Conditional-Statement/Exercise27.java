// 27. Write a Java program that reads an integer and check whether it is negative, zero, or positive.

// Test Data
// Input a number: 7
// Expected Output :

// Number is positive

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is negative");
        } else if (num > 0) {
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is zero");
        }
    }

}

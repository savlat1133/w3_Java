// 29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

// Test Data
// Input an integer number less than ten billion: 125463
// Expected Output :

// Number of digits in the number: 6

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        long num = sc.nextLong();
        char[] digits = String.valueOf(num).toCharArray();

        if(num < 0){
            System.out.println("Input positive number");
        }else{
            System.out.println("Number of digits in the number: " + digits.length);
        }
    }

}

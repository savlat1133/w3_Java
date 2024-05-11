// 30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

// Test Data
// Input first number: 2564
// Input second number: 3526
// Input third number: 2456
// Expected Output :

// All numbers are different


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

        if(num1 == num2 && num2 == num3){
            System.out.println("All of them are equal.");
        }else {
            System.out.println("They are not equal.");
        }
    }

}

// 3. Write a Java program that takes three numbers from the user and prints the greatest number.

// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println(Math.max(Math.max(num1,num2),num3));
    }
}

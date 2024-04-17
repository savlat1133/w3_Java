// 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d + %d = %d\n", a,b,a+b);
        System.out.printf("%d - %d = %d\n", a,b,a-b);
        System.out.printf("%d x %d = %d\n", a,b,a*b);
        System.out.printf("%d / %d = %d\n", a,b,a/b);
        System.out.printf("%d mod %d = %d\n", a,b,a%b);
    }
}

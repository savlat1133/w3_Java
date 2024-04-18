// 10. Write a Java program to break an integer into a sequence of digits.

// Test Data
// Input six non-negative digits: 123456
// Expected Output :
// 1 2 3 4 5 6

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input six non-negative digits: ");
        char[] digits = sc.nextLine().toCharArray();
        for (char digit : digits) {
            System.out.print(digit + " ");
        }
    }
}

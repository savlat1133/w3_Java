// 24. Write a Java program to convert a binary number to an octal number.
// Input Data:
// Input a Binary Number: 111
// Expected Output

// Octal number: 7 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toOctalString(Integer.parseInt(decimal, 2)));
    }
}

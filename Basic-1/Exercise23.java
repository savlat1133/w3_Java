// 23. Write a Java program to convert a binary number to a hexadecimal number.
// Input Data:
// Input a Binary Number: 1101
// Expected Output

// HexaDecimal value: D

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toHexString(Integer.parseInt(decimal, 2)));
    }
}

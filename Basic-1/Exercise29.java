// 29. Write a Java program to convert a hexadecimal number into a binary number.
// Input Data:
// Enter Hexadecimal Number : 37
// Expected Output

// Equivalent Binary Number is: 110111

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toBinaryString(Integer.parseInt(decimal, 16)));
    }
}

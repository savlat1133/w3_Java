// 26. Write a Java program to convert a octal number to a binary number.
// Input Data:
// Input any octal number: 7
// Expected Output

// Equivalent binary number: 111 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toBinaryString(Integer.parseInt(decimal, 8)));
    }
}

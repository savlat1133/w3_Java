// 18. Write a Java program to multiply two binary numbers.
// Input Data:
// Input the first binary number: 10
// Input the second binary number: 11
// Expected Output

// Product of two binary numbers: 110 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Input second binary number: ");
        String binary2 = sc.nextLine();

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sum = decimal1 * decimal2;

        String binarySum = Integer.toBinaryString(sum);

        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}

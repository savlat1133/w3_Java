// 27. Write a Java program to convert a octal number to a hexadecimal number.
// Input Data:
// Input a octal number : 100
// Expected Output

// Equivalent hexadecimal number: 40

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toHexString(Integer.parseInt(decimal, 8)));
    }
}

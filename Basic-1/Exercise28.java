// 28. Write a Java program to convert a hexadecimal value into a decimal number.
// Input Data:
// Input a hexadecimal number: 25
// Expected Output

// Equivalent decimal number is: 37


import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.parseInt(decimal, 16));
    }
}

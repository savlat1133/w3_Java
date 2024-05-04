// 30. Write a Java program to convert a hexadecimal value into an octal number.
// Input Data:
// Input a hexadecimal number: 40
// Expected Output

// Equivalent of octal number is: 100 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        String decimal = sc.nextLine();

        System.out.println("Output: " + Integer.toOctalString(Integer.parseInt(decimal, 16)));
    }
}

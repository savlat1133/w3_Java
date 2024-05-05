// 5. Write a Java method to count all the words in a string.
// Test Data:
// Input the string: The quick brown fox jumps over the lazy dog.
// Expected Output:

// Number of words in the string: 9

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the string: ");
        String[] input = sc.nextLine().split(" ");

        System.out.println("Number of words in the string: " + input.length);
    }
}

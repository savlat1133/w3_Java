// 4. Write a Java method to count all vowels in a string.
// Test Data:
// Input the string: w3resource
// Expected Output:

// Number of  Vowels in the string: 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the string: ");
        String input = sc.nextLine();

        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'u', 'o', 'i'));
        int count = 0;

        for(int i = 0; i < input.length(); i++){
            if(vowels.contains(Character.toLowerCase(input.charAt(i)))) {
                count++;
            }
        }
        System.out.println("Number of Vowels in the string: " + count);
    }
}

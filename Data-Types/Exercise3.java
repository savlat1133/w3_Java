// 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

// Test Data
// Input an integer between 0 and 1000: 565
// Expected Output :
// The sum of all digits in 565 is 16

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input an integer between 0 and 1000: ");
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        int sum = 0;

        for(char c : charArr){
            sum += Integer.parseInt(String.valueOf(c));
        }
        System.out.printf("The sum of all digits in %s is %d", input,sum);
    }
}

// 33. Write a Java program and compute the sum of an integer's digits.
// Input Data:
// Input an integer: 25
// Expected Output

// The sum of the digits is: 7

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input Data:");
        System.out.print("Input an integer: ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);

        int sum = 0;
        for(char i : numStr.toCharArray()){
            int digit = i - '0';
            sum += digit;
        }

        System.out.println("The sum of the digits is: " + sum);

    }
}

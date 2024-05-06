// 6. Write a Java method to compute the sum of digits in an integer.
// Test Data:
// Input an integer: 25
// Expected Output:

// The sum is 7 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input the digits: ");
        int input = sc.nextInt();

        System.out.println("The sum is " + sumOfDigits(input));
    }

    public static int sumOfDigits(int num){
        String[] arr = String.valueOf(num).split("");
        int sum = 0;
        for(String number : arr){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}

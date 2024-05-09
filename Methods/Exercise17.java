// 17. Write a Java method to count the number of digits in an integer with the value 2. The integer may be assumed to be non-negative.

// Expected Output:

// Input a number:  12541
// // 1

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the digits: ");
        int first = sc.nextInt();

        System.out.println(countDigit(first));

    }

    public static long countDigit(int input){
        String str = Integer.toString(input);
        long count = str.chars().filter(num -> num == '2').count();
        return count;
    }
}

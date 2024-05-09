// 20. Write a Java method for extracting the first digit from a positive or negative integer.

// Expected Output:

// Input an integer(positive/negative): 1234
// Extract the first digit from the said integer:
// 1

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the numbers: ");
        int first = sc.nextInt();

        System.out.println(extractFirstDigit(first));

    }

    public static int extractFirstDigit(int n){
        int fact_num = 10;
        while(n / fact_num != 0){
            fact_num *= 10;
        }
        return Math.abs(n / (fact_num/10));
    }
}

21. Write a Java method to display the factors of 3 in a given integer.

Expected Output:

Input an integer(positive/negative): 81

Factors of 3 of the said integer:
81 = 3 * 3 * 3 * 3 * 1

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the numbers: ");
        int first = sc.nextInt();

        factors(first);

    }

    public static void factors(int n){
        for(int i = 2; i <= n; i++){
            while (n % i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}

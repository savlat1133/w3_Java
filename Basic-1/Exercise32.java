// 32. Write a Java program to compare two numbers.
// Input Data:
// Input first integer: 25
// Input second integer: 39
// Expected Output

// 25 != 39                                                                          
// 25 < 39                                                                           
// 25 <= 39

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input Data:");
        System.out.print("Input first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Input second integer: ");
        int num2 = sc.nextInt();

        if(num1 != num2){
            System.out.printf("\n%d != %d", num1, num2);
        }if (num1 > num2) {
            System.out.printf("\n%d > %d", num1, num2);
        }if (num1 >= num2) {
            System.out.printf("\n%d >= %d", num1, num2);
        }if (num1 < num2) {
            System.out.printf("\n%d < %d", num1, num2);
        }if (num1 <= num2) {
            System.out.printf("\n%d <= %d", num1, num2);
        }

    }
}

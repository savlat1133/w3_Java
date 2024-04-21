// 13. Write a Java program to display the cube of the given number up to an integer.

// Test Data
// Input number of terms : 4
// Expected Output :

// Number is : 1 and cube of 1 is : 1                                               
// Number is : 2 and cube of 2 is : 8                                               
// Number is : 3 and cube of 3 is : 27                                              
// Number is : 4 and cube of 4 is : 64

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.printf("Number is : %d and cube of %d is : %.0f\n", i,i, Math.pow(i, 3));
        }
        sc.close();
    }
}

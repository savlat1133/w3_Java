// 11. Write a Java program to display n terms of natural numbers and their sum.

// Test Data
// Input the number: 2
// Expected Output :
                                                                              
// The first n natural numbers are : 2                                                                                
// 1                                                                                
// 2                                                                                
// The Sum of Natural Number upto n terms : 23

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("The first n natural numbers are: ");
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= number; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.printf("The Sum of Natural Numbers upto nth terms: %d", sum);
    }
}

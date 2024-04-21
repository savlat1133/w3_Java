// 15. Write a Java program that displays the sum of n odd natural numbers.

// Test Data
// Input number of terms is: 5
// Expected Output :

// The odd numbers are :                                                            
// 1                                                                                
// 3                                                                                
// 5                                                                                
// 7                                                                                
// 9                                                                                
// The Sum of odd Natural Number upto 5 terms is: 25

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number of terms is: ");
        int number = sc.nextInt();
        sc.close();
        int count = 0;
        int i = 1;
        int sum = 0;
        System.out.println("The odd numbers are:");
        while (count < number){
            if(i%2 == 1){
                System.out.println(i);
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("The Sum of odd natural number upto 5 terms is: " + sum);
    }
}

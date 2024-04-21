// 12. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

// Test Data
// Input the 5 numbers : 1 2 3 4 5
// Expected Output :

// Input the 5 numbers :                                                            
// 1                                                                                
// 2                                                                                
// 3                                                                                
// 4                                                                                
// 5                                                                                
// The sum of 5 no is : 15                                                          
// The Average is : 3.0  

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the 5 numbers: ");
        String[] numbers = sc.nextLine().trim().split("\\s+");
        int sum = 0;
        for(String i : numbers){
            sum += Integer.parseInt(String.valueOf(i));
        }
        System.out.printf("\nThe sum of 5 no is: %d", sum);
        System.out.printf("\nThe Average is %.1f", (double) (sum/numbers.length));
    }
}

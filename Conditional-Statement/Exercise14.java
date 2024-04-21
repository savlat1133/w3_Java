// 14. Write a Java program to display the multiplication table of a given integer.

// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
// Expected Output :

// 5 X 0 = 0                                                                        
// 5 X 1 = 5                                                                        
// 5 X 2 = 10                                                                       
// 5 X 3 = 15                                                                       
// 5 X 4 = 20                                                                       
// 5 X 5 = 25

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        int number = sc.nextInt();
        for(int i = 0; i <= number; i++){
            System.out.printf("%d x %d = %d\n", number,i, number*i);
        }
        sc.close();
    }
}

// 22. Write a Java program to display Pascal's triangle.

// Test Data
// Input number of rows: 5
// Expected Output :

// Input number of rows: 5                                                          
//       1                                                                          
//      1 1                                                                         
//     1 2 1                                                                        
//    1 3 3 1                                                                       
//   1 4 6 4 1   

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int numRows = sc.nextInt();

        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}

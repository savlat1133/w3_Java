// 23. Write a Java program to generate the following * triangles.

// Test Data
// Input the number: 6
// Expected Output :

// ******                                                   
//  *****                                                   
//   ****                                                   
//    ***                                                   
//     **                                                   
//      * 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = 1; j <= num-i; j++){
                System.out.print(" ");
            }
            for(int n = 0; n < i; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

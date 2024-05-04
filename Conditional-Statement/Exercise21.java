// 21. Write a Java program to display the pattern like a diamond.

// Test Data
// Input number of rows (half of the diamond) : 7
// Expected Output :

                                                                                 
//       *                                                                          
//      ***                                                                         
//     *****                                                                        
//    *******                                                                       
//   *********                                                                      
//  ***********                                                                     
// *************                                                                    
//  ***********                                                                     
//   *********                                                                      
//    *******                                                                       
//     *****                                                                        
//      ***                                                                         
//       *  


import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = num-1; i > 0; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

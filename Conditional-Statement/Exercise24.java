// 24. Write a Java program to generate the following @'s triangle.

// Test Data
// Input the number: 6
// Expected Output :

//       @                                                  
//      @@                                                  
//     @@@                                                  
//    @@@@                                                  
//   @@@@@                                                  
//  @@@@@@

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int n = num; n > i; n--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}

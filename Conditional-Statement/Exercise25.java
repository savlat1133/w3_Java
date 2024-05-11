// 25. Write a Java program to display the number rhombus structure.

// Test Data
// Input the number: 7
// Expected Output :

                                   
//       1                                                  
//      212                                                 
//     32123                                                
//    4321234                                               
//   543212345                                              
//  65432123456                                             
// 7654321234567                                            
//  65432123456                                             
//   543212345                                              
//    4321234                                               
//     32123                                                
//      212                                                 
//       1   

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int n = i; n < num; n++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            if(i >= 2){
                for(int k = 2; k <= i; k++){
                    System.out.print(k);
                }
            }
            System.out.println("");
        }
        
        for(int i = num-1; i >= 1; i--){
            for(int n = i; n < num; n++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j);
            }
            if(i >= 2){
                for(int k = 2; k <= i; k++){
                    System.out.print(k);
                }
            }
            System.out.println("");
        }
        }
}

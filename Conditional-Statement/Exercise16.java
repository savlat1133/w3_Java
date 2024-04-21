// 16. Write a Java program to display the pattern like a right angle triangle with a number.

// Test Data
// Input number of rows : 10
// Expected Output :

// 1                                                                                
// 12                                                                               
// 123                                                                              
// 1234                                                                             
// 12345                                                                            
// 123456                                                                           
// 1234567                                                                          
// 12345678                                                                         
// 123456789                                                                        
// 12345678910

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        sc.close();
        String output = "";
        for(int i = 1; i <= rows; i++){
            output += i;
            System.out.println(output);
        }
    }
}

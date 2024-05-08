// 12. Write a Java method (takes n as input) to display an n-by-n matrix.

// Expected Output:

// Input a number: 10                                                                         
// 1 0 0 1 1 0 0 0 1 1                                                                       
// 0 0 1 0 1 0 1 0 0 0                                                                        
// 0 1 0 1 0 0 0 0 0 1                                                                       
// 1 1 1 0 0 0 0 1 1 1                                                                        
// 1 1 0 1 1 1 0 1 0 0                                                                      
// 1 0 0 0 1 1 0 0 0 0                                                                       
// 0 0 1 0 0 0 0 1 1 1                                                                      
// 1 1 0 1 0 1 0 0 1 0                                                                       
// 0 0 1 0 0 0 0 1 1 0                                                        
// 1 1 1 0 0 1 1 1 1 0

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int input = sc.nextInt();
        matrixGenerate(input);
    }

    public static void matrixGenerate(int n){
        Random random = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(random.nextInt(2) + " ");
            }
            System.out.println("");
        }
    }
}

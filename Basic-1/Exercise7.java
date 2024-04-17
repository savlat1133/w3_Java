// 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", num,i,num*i);
        }
    }
}

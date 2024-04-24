// 18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.

// The pattern like :

// 1
// 2 3
// 4 5 6
// 7 8 9 10 

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int n = sc.nextInt();
        int num = 1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println("");
        }
    }
}

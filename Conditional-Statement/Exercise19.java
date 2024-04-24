// 19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

//        1
//       2 2
//      3 3 3
//     4 4 4 4 

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
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

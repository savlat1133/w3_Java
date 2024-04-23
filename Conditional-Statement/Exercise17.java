// 17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

// The pattern is as follows :

// 1
// 22
// 333
// 4444

import java.util.*;
public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Input the number: ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 4; i++){
            for(int n = i; n > 0; n--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

// 2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int num = sc.nextInt();
        System.out.println(calculateSum(1, num));
    }

    public static int calculateSum(int from, int to){
        if(from == to){
            return from;
        }
        return from + calculateSum(from+1,to);
    }
}

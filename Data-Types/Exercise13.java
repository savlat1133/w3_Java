// 13. Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number: ");
        int number = sc.nextInt();
        System.out.print("Input the divisor: ");
        int divisor = sc.nextInt();
        System.out.println("'/' Operator: " + (number/divisor));
        System.out.println("floorDiv() method: " + Math.floorDiv(number,divisor));
        System.out.println("'%' Operator: " + (number%divisor));
        System.out.println("floorMod() method: " + Math.floorMod(number,divisor));
    }
}

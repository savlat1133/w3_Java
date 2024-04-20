// 1. Write a Java recursive method to calculate the factorial of a given positive integer.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input number: ");
        int num = sc.nextInt();

        FactorialCalculator factorial = new FactorialCalculator();

        System.out.printf("Factorial of %d is %d", num, factorial.calculateFactorial(num));

    }
}

class FactorialCalculator{
    public int calculateFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * calculateFactorial(n-1);
    }
}

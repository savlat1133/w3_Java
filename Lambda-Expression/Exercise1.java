// 1. Write a Java program to implement a lambda expression to find the sum of two integers.

import java.util.function.Supplier;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Supplier<Integer> sumCalculator = () -> {
            int num1 = 5;
            int num2 = 10;
            return num1 + num2;
        };
        int sum = sumCalculator.get();

        System.out.println("The sum of 5 and 10 is: " + sum);
        
    }
}

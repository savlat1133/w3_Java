// 5. Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input base: ");
        double base = sc.nextDouble();
        System.out.print("Input exponent: ");
        int exponent = sc.nextInt();

        System.out.printf("Base %.2f raised to the power of %d is %.2f", base,exponent, exponentiation(base,exponent));
    }

    public static double exponentiation(double base, int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * exponentiation(base, exponent-1);
    }
}

// 3. Write a Java recursive method to calculate the nth Fibonacci number.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input position: ");
        int num = sc.nextInt();
        System.out.println(Fibonacci.calculateFibNumber(num));
    }

}

class Fibonacci{
    public static int calculateFibNumber(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return calculateFibNumber(n-1) + calculateFibNumber(n-2);
    }
}

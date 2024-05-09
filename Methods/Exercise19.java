// 19. Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false.

// Expected Output:

// Input the first number:  2
// Input the second number:  4
// Input the third number:  6
// Check whether the three said numbers has a midpoint!
// true

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int first = sc.nextInt();
        System.out.print("Input the second number: ");
        int second = sc.nextInt();
        System.out.print("Input the third number: ");
        int third = sc.nextInt();

        System.out.println(middlePoint(first,second,third));

    }

    public static boolean middlePoint(int first, int second, int third){
        int min = Math.min(first, Math.min(second, third));
        int max = Math.max(first, Math.max(second, third));
        double mid = (max + min)/2;
        int midPoint = first + second + third - max - min;
        return (mid == midPoint);
    }

}

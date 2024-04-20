// 15. Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input floating number: ");
        float ftNum = sc.nextFloat();
        System.out.print("Input double number: ");
        double dbNum = sc.nextDouble();

        float ftNextUp = Math.nextUp(ftNum);
        float ftNextDown = Math.nextDown(ftNum);
        System.out.println("Float " + ftNum + " next up is " + ftNextUp);
        System.out.println("Float " + ftNum + " next up is " + ftNextDown);

        double dbNextUp = Math.nextUp(dbNum);
        double dbNextDown = Math.nextDown(dbNum);
        System.out.println("Double " + dbNum + " next up is " + dbNextUp);
        System.out.println("Double " + dbNum + " next up is " + dbNextDown);
    }
}

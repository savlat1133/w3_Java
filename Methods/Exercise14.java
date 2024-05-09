// 14. Write a Java method to create a pentagon's area.

// Expected Output:

// Input the number of sides: 5                             
// Input the side: 6                                        
// The area of the pentagon is 61.93718642120281

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number of side: ");
        int n = sc.nextInt();
        System.out.print("Input the side: ");
        double side = sc.nextInt();

        System.out.println("The area of the pentagon is " + areaOfPentagon(n, side));
    }
    public static double areaOfPentagon(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
}

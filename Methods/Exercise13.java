// 13. Write Java methods to calculate triangle area.

// Expected Output:

// Input Side-1: 10                                                                               
// Input Side-2: 15                                                                               
// Input Side-3: 20                                                                              
// The area of the triangle is 72.6184377413890


import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input Side-1: ");
        int first = sc.nextInt();
        System.out.print("Input Side-2: ");
        int second = sc.nextInt();
        System.out.print("Input Side-3: ");
        int third = sc.nextInt();
        System.out.println( isValid(first, second,third) ?
                "The area of the triangle is " + areaOfTriangle(first, second, third) : "Invalid triangle" );

    }
    public static boolean isValid(double side1, double side2, double side3) {
        if( side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) return true;
        else return false;
    }
    public static double areaOfTriangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }
}

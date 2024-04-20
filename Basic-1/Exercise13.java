// 13. Write a Java program to print the area and perimeter of a rectangle.
// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.printf("\nArea is %.1f * %.1f = %.2f", width,height,width*height);
        System.out.printf("\nPerimeter is 2 * (%.1f + %.1f) = %.2f",width,height, 2*(width+height));
    }
}

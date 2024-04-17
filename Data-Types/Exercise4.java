// 4. Write a Java program to convert minutes into years and days.

// Test Data
// Input the number of minutes: 3456789
// Expected Output :
// 3456789 minutes is approximately 6 years and 210 days

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the number of minutes: ");
        int minutes = sc.nextInt();
        int days = (minutes/60)/24;
        int years = days/365;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes,years,days%365);
    }
}

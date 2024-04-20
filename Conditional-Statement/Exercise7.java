// 7. Write a Java program to find the number of days in a month.

// Test Data
// Input a month number: 2
// Input a year: 2016
// Expected Output :
// February 2016 has 29 days

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a month number between 1 to 12: ");
        int month = sc.nextInt();
        System.out.print("Input a year: ");
        int year = sc.nextInt();

        System.out.printf("%s %d has %d days",getMonth(month),year,getNumberOfDays(year,month));
    }

    public static String getMonth(int month){
        switch (month){
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month"; // Handle invalid month numbers
        }
    }
    public static int getNumberOfDays(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

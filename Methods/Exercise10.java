// 10. Write a Java method to check whether a year (integer) entered by the user is a leap year or not.

// Expected Output:

// Input a year: 2017                                                                        
// false

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a year: ");
        int input = sc.nextInt();
        System.out.println(isLeap(input));
    }

    public static boolean isLeap(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }
}

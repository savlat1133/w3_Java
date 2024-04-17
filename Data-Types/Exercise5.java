// 5. Write a Java program that prints the current time in GMT.

// Test Data
// Input the time zone offset to GMT: 256
// Expected Output:
// Current time is 23:40:24

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the time zone offset to GMT: ");
        int timeZone = sc.nextInt();
        long timeInMiliseconds = System.currentTimeMillis();

        long seconds = timeInMiliseconds/1000;
        long currentSecond = seconds&60;
        long minutes = seconds/60;
        long currentMinute = minutes%60;
        long hours = minutes/60;
        long currentHour = (hours + timeZone)%24;
        System.out.printf("Current time is %d:%d:%d", currentHour,currentMinute,currentSecond);
    }
}

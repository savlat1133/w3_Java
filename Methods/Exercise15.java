//15. Write a Java method to display the current date and time.

// Expected Output:

// Current date and time: Wednesday January 25, 2017 7:47:43


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        currentDate();
    }
    public static void currentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }
}

// 4. Write a Java program to calculate the average value of array elements
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        int sum = 0;

        for(int num : numbers){
            sum += num;
        }
        
        double average = sum/numbers.length;
        System.out.println("The average is: " + average);
        
    }
}

// 5. Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        System.out.println(containsValue(numbers, 25));

    }

    public static boolean containsValue(int[] array, int value){
        for(int num : array){
            if(num == value){
                return true;
            }
        }
        return false;
    }
}

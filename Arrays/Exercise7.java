// 7. Write a Java program to remove a specific element from an array.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}

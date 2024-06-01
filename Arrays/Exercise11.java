// 11. Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        int n = numbers.length;
        for(int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }

}

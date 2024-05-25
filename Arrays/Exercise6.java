// 6. Write a Java program to find the index of an array element.

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        System.out.println(index(numbers, 34));


    }

    public static int index(int[] array, int target){
        int index = 0;
        for(int num : array){
            if(target == num){
                return index;
            }
            index++;
        }
        return -1;
    }
}

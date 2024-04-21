// 1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        String[] myArray2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println("Unsorted array " + Arrays.toString(myArray1));
        System.out.println("Unsorted array " + Arrays.toString(myArray2));
        Arrays.sort(myArray1);
        Arrays.sort(myArray2);
        System.out.println("Sorted array " + Arrays.toString(myArray1));
        System.out.println("Sorted array " + Arrays.toString(myArray2));
    }
}

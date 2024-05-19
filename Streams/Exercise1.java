// 1. Write a Java program to calculate the average of a list of integers using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

       double average = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println(average);
    }
}

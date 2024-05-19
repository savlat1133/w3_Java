// 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int max = list.stream()
                .max(Integer::compare)
                .orElse(null);
        int min = list.stream()
                .min(Integer::compare)
                .orElse(null);

        System.out.println(max);
        System.out.println(min);
    }
}

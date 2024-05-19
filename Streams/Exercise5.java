// 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Blue", "Green", "Black");

        long count = list.stream()
                .filter(str -> str.startsWith(String.valueOf("B")))
                .count();

        System.out.println(count);
    }
}

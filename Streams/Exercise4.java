// 4. Write a Java program to remove all duplicate elements from a list using streams.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,3,4,5,6);

        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(newList);
    }
}

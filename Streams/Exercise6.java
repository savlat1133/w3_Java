// 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Blue", "Green", "Black");

        List<String> listAsc = list.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> listDes = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(listAsc);
        System.out.println(listDes);
    }
}

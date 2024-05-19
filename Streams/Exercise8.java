// 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Integer max = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        Integer min = list.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);


        System.out.println(max);
        System.out.println(min);
    }
}

// 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue");

        List<String> lowerCase = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCase);
        List<String> upperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}

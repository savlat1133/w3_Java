// 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue");

        System.out.println("Lower case");
        list.replaceAll(str -> str.toLowerCase());
        list.forEach(System.out::println);

        System.out.println("Upper case");
        list.replaceAll(str -> str.toUpperCase());
        list.forEach(System.out::println);
    }
}

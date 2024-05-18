// 2. Write a Java program to implement a lambda expression to check if a given string is empty.

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the string: ");
        String input = sc.nextLine();
        sc.close();

        Predicate<String> isEmpty = (str) -> str.isEmpty();

        System.out.println("Is string empty?: " + isEmpty.test(input));
    }
}

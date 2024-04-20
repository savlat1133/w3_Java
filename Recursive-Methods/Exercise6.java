// 6. Write a Java recursive method to reverse a given string.

import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input string: ");
        String str = sc.nextLine();

        System.out.printf(reverse(str));
    }

    public static String reverse(String str){
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}

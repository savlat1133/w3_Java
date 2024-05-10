// 22. Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false.

Expected Output:

Input an integer: 8642
Check whether every digit of the said integer is even or not!
true

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the numbers: ");
        int num = sc.nextInt();

        System.out.println(allEven(num));

    }

    public static boolean allEven(int n){
        char[] chr = Integer.toString(n).toCharArray();
        for(char c : chr){
            int num = Integer.parseInt(String.valueOf(c));
            if(num % 2 != 0){
                return false;
            }
        }
        return true;
    }
}

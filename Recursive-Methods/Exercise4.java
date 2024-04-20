// 4. Write a Java recursive method to check if a given string is a palindrome.


import java.util.Scanner;

public class Main{
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input string: ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        if (firstChar != lastChar){
            return false;
        }
        String substring = str.substring(1, str.length()-1);
        return isPalindrome(substring);
    }

}

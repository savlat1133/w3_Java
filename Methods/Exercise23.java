// 23. Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.

// Expected Output:

// Input a string:  AIEEE
// Check all the characters of the said string are vowels or not!
// true

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the string: ");
        String str = sc.nextLine();

        System.out.println(checkStringAllVowel(str));

    }

    public static boolean checkStringAllVowel(String str){
        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));

        for(int i = 0; i < str.length(); i++){
            if(!vowels.contains(String.valueOf(str.charAt(i)))) return false;
        }
        return true;
    }
}

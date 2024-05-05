// 3. Write a Java method to display the middle character of a string.
// Note: a) If the length of the string is odd there will be two middle characters.
// b) If the length of the string is even there will be one middle character.
// Test Data:
// Input a string: 350
// Expected Output:

                                                                          
// The middle character in the string: 5
// Click me to see the solution


import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the string: ");
        String number = sc.nextLine();

        String result = "";

        if(number.length()%2 == 0){
            int middle = number.length()/2;
            result = number.substring(middle - 1, middle + 1);
        }else{
            result = String.valueOf(number.charAt(number.length()/2));
        }

        System.out.println("The middle character in the string: " + result);
    }
}

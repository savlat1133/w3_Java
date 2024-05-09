// 18. Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.

// Expected Output:

// Input the first number:  15
// Input the second number:  16
// Input the third number:  17
// Check whether the three said numbers are consecutive or not

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int first = sc.nextInt();
        System.out.print("Input the second number: ");
        int second = sc.nextInt();
        System.out.print("Input the third number: ");
        int third = sc.nextInt();

        checkConsecutive(first,second,third);
    }
    public static void checkConsecutive(int first, int second, int third){
        if(third == (second + 1) && second == (first + 1)){
            System.out.println("They are consecutive numbers.");
        }else{
            System.out.println("They are not consecutive numbers.");
        }
    }
}

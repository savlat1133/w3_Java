// 9. Write a Java method to print characters between two characters (i.e. A to P).
// Note: Prints 20 characters per line

// Expected Output:

// ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;                  
// < = > ? @ A B C D E F G H I J K L M N O                  
// P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c                  
// d e f g h i j k l m n o p q r s t u v w                  
// x y z

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char first = '(';
        char last = 'z';
        printCharacters(first,last);
    }

    public static void printCharacters(char input1, char input2){
        int char1 = input1;
        int char2 = input2;
        int count = 0;
        for(int i = char1; i <= char2; i++){
            if(count == 20){
                System.out.println("");
                count = 0;
            }
            System.out.print((char) i + " ");
            count++;
        }
    }
}

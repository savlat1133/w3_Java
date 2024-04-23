// 15. Write a Java program to swap two variables.

public class Main{
    public static void main(String[] args){
        int a = 2;
        int b = 0;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}

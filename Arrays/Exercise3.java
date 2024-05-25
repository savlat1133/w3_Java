// 3. Write a Java program to print the following grid.
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input the grid: ");
        int grid = sc.nextInt();

        for(int i = 0; i < grid; i++){
            for(int n = 0; n < grid; n++){
                System.out.print("_ ");
            }
            System.out.println("");
        }
    }
}

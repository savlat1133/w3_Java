// 2. Write a Java program to sum values of an array.

public class Main {
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int num: my_array){
            sum += num;
        }

        System.out.println("The sum of array: " + sum);

    }
}

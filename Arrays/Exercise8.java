// 8. Write a Java program to copy an array by iterating the array.
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};

        int[] copy = copyArray(numbers);

        System.out.println(Arrays.toString(copy));
    }

    public static int[] copyArray(int[] array){
        int[] newArray = new int[array.length];

        for(int i = 0 ; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    
}

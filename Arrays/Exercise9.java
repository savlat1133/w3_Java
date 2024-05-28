// 9. Write a Java program to insert an element (specific position) into an array.

import java.util.Arrays;
import org.w3c.dom.ranges.RangeException;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5 };
        int[] newNumbers = insert(numbers, 0, 4);

        System.out.println(Arrays.toString(newNumbers));

    }

    public static int[] insert(int[] array, int element, int position){
        if(position < 0 || position > array.length){
            throw new RangeException((short) 0, "Out of range");
        }

        int[] newArray = new int[array.length + 1];

        for(int i = 0; i <= array.length; i++){
            if(i >= position){
                if(position == i){
                    newArray[i] = element;
                }else{
                    newArray[i] = array[i - 1];
                }
            }else{
                newArray[i] = array[i];
            }
        }
        return newArray;

    }

}

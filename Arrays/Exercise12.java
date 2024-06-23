// 12. Write a Java program to find duplicate values in an array of integer values.

import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 3, 2, 5};

        System.out.println(duplicate(array));

    }

    public static List<Integer> duplicate(int[] arr){
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else if(set.contains(arr[i]) && !result.contains(arr[i])){
                result.add(arr[i]);
            }
        }

        return  result;
    }
}

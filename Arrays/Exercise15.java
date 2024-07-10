// 15. Write a Java program to find common elements between two integer arrays.

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        Integer[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].equals(array2[j])){
                    set.add(array1[i]);
                }
            }
        }
        System.out.println(set);
    }
}

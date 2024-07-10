// 16. Write a Java program to remove duplicate elements from an array.

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 2, 6, 4, 7};

        int newLength = removeDuplicates(num);

        System.out.println(Arrays.toString(Arrays.copyOf(num, newLength)));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int newIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[newIndex++] = nums[i];
            }
        }

        return newIndex;
    }
}

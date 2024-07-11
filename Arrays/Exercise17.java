// 17. Write a Java program to find the second largest element in an array.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(secondLargest(numbers));

    }
    public static int secondLargest(int[] nums) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }
        }
        return secondLargest;
    }
}

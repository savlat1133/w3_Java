// 8. Write a Java recursive method to count the number of occurrences of a specific element in an array.



import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 5, 6, 2};
        int target = 2;

        int occurrences = countOccurrences(array, target, 0);
        System.out.println("Number of occurrences of " + target + ": " + occurrences);

    }

    public static int countOccurrences(int[] arr, int target, int index){
        if(index >= arr.length){
            return 0;
        }

        int count = (arr[index] == target) ? 1 : 0;
        return count + countOccurrences(arr, target, index + 1);
    }

}

// 10. Write a Java program to find the maximum and minimum value of an array.
public class Main {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5 };

        System.out.println(minMax(numbers, "max"));

    }

    public static int minMax(int[] array, String value){
        int result;
    
        if(value.equalsIgnoreCase("min")){
            result = array[0];
            for(int num : array){
                if(num < result){
                    result = num;
                }
            }
        } else if(value.equalsIgnoreCase("max")){
            result = array[0];
            for(int num : array){
                if(num > result){
                    result = num;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid value: " + value);
        }
        return result;
    }

}

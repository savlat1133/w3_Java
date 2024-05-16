// 2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            isEven(5);
        } catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
    public static void isEven(int number){
        if(number % 2 != 0){
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}

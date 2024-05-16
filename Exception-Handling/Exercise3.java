// 3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            readFile("test1.txt");
        } catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}

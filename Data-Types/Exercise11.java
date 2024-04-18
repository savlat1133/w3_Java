// 11. Write a Java program to test whether a given double/float value 
// is a finite floating-point value or not.

public class Main {
    public static void main(String[] args) {
        double a = Math.PI;
        float b = 3.14159265f;
        System.out.println(Double.isFinite(a));
        System.out.println(Float.isFinite(b));
    }
}

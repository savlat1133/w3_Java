1. Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, and Circle that implement the Shape interface. Implement the getArea() method for each of the three classes.


// Main.java file
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);
        Circle circle = new Circle(3);

        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Area of the Circle: " + circle.getArea());
}
}

// Rectangle.java file
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * length;
    }
}

// Circle.java file
public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Shape.java
public interface Shape {
    double getArea();
}

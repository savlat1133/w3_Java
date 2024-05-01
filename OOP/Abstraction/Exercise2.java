// 2. Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
// Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.


// Main.java file
public class Main {
    public static void main(String[] args) {
        double r = 4.0;
        Circle circle = new Circle(r);
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Triangle triangle = new Triangle(ts1, ts2, ts3);
        System.out.println("Radius of the Circle"+r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
        System.out.println("\nSides of the Traiangel are: "+ts1+','+ts2+','+ts3);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}

// Shape.java file
package shape;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle.java file
package shape;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}


// Triangle.java file
package shape;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea(){
        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s - a) * (s - b) * (s - c));
    }
    @Override
    public double calculatePerimeter(){
        return a + b + c;
    }
}

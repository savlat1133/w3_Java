// 8. Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
// Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

// Main.java file
public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.println("Radius of the Circle " + radius);
        System.out.println("Perimeter " + c1.getPerimeter());
        System.out.println("Area " + c1.getArea());
    }
}

// Shape.java file
public class Shape {
    public double getPerimeter(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }
}

// Circle.java file
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

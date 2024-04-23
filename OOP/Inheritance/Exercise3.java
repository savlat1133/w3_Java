// 3. Write a Java program to create a class called Shape with a method called getArea().
// Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle

// Main.java file
public class Main{
    public static void main(String[] args){
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(2.0, 2.0);
        System.out.println("Shape: "+shape.getArea());
        System.out.println("Rectangle: "+rectangle.getArea());
    }
}
// Shape.java file
public class Shape {
    public double getArea(){
        return 0.0;
    }
}
// Rectangle.java file
public class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return height*width;
    }
}

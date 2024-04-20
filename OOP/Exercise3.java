// 3. Write a Java program to create a class called "Rectangle" with width and height attributes. 
// Calculate the area and perimeter of the rectangle.

//Rectangle.java file
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return Math.pow((width+height), 2);
    }
}

//Main.java file
public class Main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.printf("The area of the rectangle is %.2f\n", rectangle.getArea());
        System.out.printf("The perimeter of the rectangle is %.2f\n", rectangle.getPerimeter());
        System.out.println("Updated rectangle");

        rectangle.setWidth(6);
        rectangle.setHeight(14);

        System.out.printf("The area of the rectangle is %.2f\n", rectangle.getArea());
        System.out.printf("The perimeter of the rectangle is %.2f\n", rectangle.getPerimeter());

    }
}

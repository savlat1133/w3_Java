// 3. Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

public class Main {
  public enum Shape {
    SQUARE,
    CIRCLE,
    RECTANGLE,
    TRIANGLE,
    HEXAGON
  }

  public static void main(String[] args) {
    Shape shape1 = Shape.CIRCLE;
    Shape shape2 = Shape.SQUARE;

    System.out.println("First shape: " + shape1);
    System.out.println("Second shape: " + shape2);
  }
}

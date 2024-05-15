// 6. Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.

// Main.java file
import shape3D.Cube;
import shape3D.Shape3D;
import shape3D.Sphere;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(7.0);
        Shape3D cube = new Cube(6.0);

        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());

        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }
}

// Sphere.java file
package shape3D;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}


// Cube.java file
package shape3D;

public class Cube extends Shape3D {
    private double sideLength;

    public Cube(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

// Shape3D.java file
package shape3D;

public abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}

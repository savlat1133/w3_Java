// 7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.


// Main.java file
import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Vehicle;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

// Motorcycle.java file
package vehicle;

public class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle: Starting the engine..");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle: Stopping the engine..");
    }
}

// Car.java file
package vehicle;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car: Starting the engine...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car: Stopping the engine...");
    }
}


// Vehicle.java file
package vehicle;

public abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

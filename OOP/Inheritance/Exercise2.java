// 2. Write a Java program to create a class called Vehicle with a method called drive(). 
// Create a subclass called Car that overrides the drive() method to print "Repairing a car".

// Main.java file
public class Main{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}

// Vehicle.java file
public class Vehicle {
    public void drive(){
        System.out.println("Driving");
    }
}

// Car.java file
public class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Reparing a car");
    }
}


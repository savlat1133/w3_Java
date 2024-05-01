// 9. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
// Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

// Main.java file
public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1, 1.0);

        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }
}


// Car.java file
public class Car extends Vehicle {
    private int numSeats;

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }


    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 120.0;
    }
}


// Motercycle.java file
public class Motorcycle extends Vehicle{
    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double engineDisplacement) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.engineDisplacement = engineDisplacement;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }

    @Override
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80.0;
    }
}
// Vehicle.java file
public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();
}

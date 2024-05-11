// 5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

// Main.java file
import employee.Employee;
import employee.Manager;
import employee.Programmer;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Employee manager = new Manager("Corona Cadogan", 6000, 1000);
        Employee programmer = new Programmer("Antal Nuka", 5000, 20, 25.0);

        manager.displayInfo();
        System.out.println("---------------------");
        programmer.displayInfo();

    }
}

// Programmer.java file
package employee;

public class Programmer extends Employee{

    private int overtimeHours;
    private double hourlyRate;

    public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return baseSalary + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayInfo(){
        System.out.println("Programmer Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}


// Manager.java file
package employee;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateSalary());
    }
}

// Employee.java file
package employee;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

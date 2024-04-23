// 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


// Main.java file
public class Main{
    public static void main(String[] args){
        HRManager hrManager = new HRManager(100.00);
        Employee employee = new Employee(102.2);

        System.out.println(hrManager.getSalary());
        System.out.println(employee.getSalary());

        hrManager.addEmployee();
        hrManager.work();

        employee.work();

    }
}
// Employee.java file
public class Employee {
    private double salary;

    Employee(double salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Working");
    }

    public double getSalary(){
        return salary;
    }
}
// HRManager.java file
public class HRManager extends Employee {
    public HRManager(double salary){
        super(salary);
    }

    @Override
    public void work(){
        System.out.println("Hiring people");
    }

    public void addEmployee(){
        System.out.println("Hired");
    }
}


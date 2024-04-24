// 7. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
// Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.


// Main.java file
public class Main{
    public static void main(String[] args){
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeID() + ")");
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeID() + ")");
    }
}
// Employee.java file
public class Employee extends Person{
    private int employeeID;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeID, String jobTitle){
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    @Override
    public String getLastName(){
        return super.getLastName() + ", " + jobTitle;
    }
}
// Person.java file
public class Person {
    
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}

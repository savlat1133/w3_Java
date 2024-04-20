// 1. Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.


//Person.java file
public class Person {

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

//Main.java file
public class Main{
    public static void main(String[] args) {
        Person person1 = new Person("Name1", 18);
        Person person2 = new Person("Name2", 19);

        System.out.printf("Name: %s Age: %d\n", person1.getName(), person1.getAge());
        System.out.printf("Name: %s Age: %d\n", person2.getName(), person2.getAge());

    }
}

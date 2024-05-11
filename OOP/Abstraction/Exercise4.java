// 4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). 
// Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.



// Main.java file
import animal.Lion;
import animal.Tiger;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        lion.eat();
        tiger.eat();
        System.out.println(" ");
        lion.sleep();
        tiger.sleep();
    }

}

// Lion.java file
package animal;

public class Lion extends Animal {

    @Override
    public void eat(){
        System.out.println("Lion is eating.");
    }
    @Override
    public void sleep(){
        System.out.println("Lion is sleeping.");
    }
}

// Tiger.java file
package animal;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping.");
    }
}

// Animal.java file
package animal;

public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

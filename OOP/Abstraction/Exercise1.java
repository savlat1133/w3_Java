// 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). 
// Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.




// Main.java file
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        lion.sound();
        tiger.sound();
    }
}

// Tiger.java file
public class Tiger extends Animal{

    @Override
    public void sound(){
        System.out.println("Tiger is roaring");
    }
}

// Lion.java file
public class Lion extends  Animal{
    @Override
    public void sound(){
        System.out.println("Lion is roaring");
    }
}

// Animal.java file
public abstract class Animal {
    public abstract void sound();
}

// 1. Write a Java program to create a class called Animal with a method called makeSound(). 
// Create a subclass called Cat that overrides the makeSound() method to bark.

//Main.java file
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
    }
}

//Animal.java file
public class Animal {
    public void makeSound(){
        System.out.println("Make sound.");
    }
}

// Cat.java file
public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}



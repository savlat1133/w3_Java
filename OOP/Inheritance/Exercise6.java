// 6. Write a Java program to create a class called Animal with a method named move(). 
// Create a subclass called Cheetah that overrides the move() method to run.

// Main.java file
public class Main{
    public static void main(String[] args){
        Animal animal = new Animal();
        Cheetah cheetah = new Cheetah();

        animal.move();
        cheetah.move();
    }
}
// Animal.java file
public class Animal {
    
    public void move(){
        System.out.println("Animal is moving.");
    }
}

// Cheetah.java file
public class Cheetah extends Animal{
    
    @Override
    public void move(){
        System.out.println("Cheetah is moving.");
    }
}

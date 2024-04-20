// 2. Write a Java program to create a class called "Dog" with a name and breed attribute. 
// Create two instances of the "Dog" class, set their attributes using the constructor and 
// modify the attributes using the setter methods and print the updated values.

//Dog.java file
public class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

//Main.java file
public class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Funtik", "Afcharka");
        Dog dog2 = new Dog("Pushka", "Bulldog");

        System.out.printf("Name: %s Breed: %s\n", dog1.getName(), dog1.getBreed());
        System.out.printf("Name: %s Breed: %s\n", dog2.getName(), dog2.getBreed());

        dog1.setName("New Funtik");
        dog1.setBreed("Bullcat");
        System.out.println("Updated attributes");
        System.out.printf("Name: %s Breed: %s\n", dog1.getName(), dog1.getBreed());
        System.out.printf("Name: %s Breed: %s\n", dog2.getName(), dog2.getBreed());

    }
}

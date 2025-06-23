// [Example 4.0 - IS-A relationship]
class Animal {}                 // Superclass of Mammal / Reptile class
class Mammal extends Animal {}  // Parent class of Dog / child class of Animal
class Reptile extends Animal {} // Derived class of Animal
class Dog extends Mammal {     // Subclass of Mammal and Animal
    
    public Dog() {}

    public void display() {
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();
        Dog dog = new Dog();

        System.out.println();
        System.out.println(mammal instanceof Animal);
        System.out.println(reptile instanceof Animal);
        System.out.println(mammal instanceof Dog);
        System.out.println(dog instanceof Mammal);
        System.out.println(dog instanceof Animal);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
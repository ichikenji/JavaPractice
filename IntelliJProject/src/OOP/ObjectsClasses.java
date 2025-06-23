import java.awt.*;

public class ObjectsClasses {
    public static void main(String[] args) {
        ClassStudent student1 = new ClassStudent("Lain Iwakura", 333, "Computer Science");
        ClassStudent student2 = new ClassStudent("Kyomoto", 2004, "Visual Arts");
        ClassStudent student3 = new ClassStudent("Fujino", 2025, "Visual Arts");
        student1.printDetails();
        student2.printDetails(true);
        student3.printDetails(false);

        // ?%%% ABSTRACTION example %%%
        CarClass car1 = new CarClass("Nissan", "Skyline Gtr", "Sea Blue");
        CarClass car2 = new CarClass("Honda", "Mazda RX-7", "White");
        car1.printDetails();
        car1.startEngine();
        car2.printDetails();
        car2.startEngine();
    }
}

// ?%%%%%   OOP example + INHERITANCE   %%%%%
// *%%%%%   INHERITANCE example   %%%%%
class Person {
    protected String name; // Changed to protected

    Person(String name) {
        this.name = name;
    }
}

class ClassStudent extends Person {
    // Declaring attributes
    String section;
    int rollNo;

    // Initialise attributes
    ClassStudent(String name, int rollNo, String section) {
        super(name);
        this.rollNo = rollNo;
        this.section = section;
    }

    public void printDetails() {
        System.out.println("\n%%%%%%%%%% Student Details %%%%%%%%%%");
        System.out.println("   Student Name: " + name);
        System.out.println("   Roll Number: " + rollNo);
        System.out.println("   Section: " + section);
    }

    // %%%%%   POLYMORPHISM example   %%%%%
    public void printDetails(boolean hideSection) {
        System.out.println("\n%%%%%%%%%% Student Details %%%%%%%%%%");
        System.out.println("   Student Name: " + name);
        System.out.println(hideSection ? "   [HIDDEN]" : "   Roll Number: " + rollNo);
        System.out.println(hideSection ? "   [HIDDEN]" : "   Section: " + section);
    }
}

// ?%%%%% ABSTRACTION example %%%%%
abstract class VehicleClass {
    public void startEngine() {
        System.out.println("* Engine started: BROOMMMMMMMMMMMMMMM");
    }
}

class CarClass extends VehicleClass {
    private String brand, model, color;

    public CarClass(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public void printDetails() {
        System.out.println("\n%%%%% Car Details %%%%%");
        System.out.println("    Brand: " + brand);
        System.out.println("    Model: " + model);
        System.out.println("    Color: " + color);
    }
}

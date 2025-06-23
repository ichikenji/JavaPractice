package OOP;

/*  ABSTRACTION
    Data abstraction is the process of hiding the implementation details and
    only showing the essential information to the user.

    Abstraction can be achieved with either abstract classes or interfaces.

    The 'abstract' keyword is a non-access modifier, used for classes and methods.

    Abstract class : Is a restricted class that cannot be used to create objects
                    (to access itm it must be inherited from another class)
    Abstract method : Can only be used in an abstract class and doesn't have a body
                    (The body is provided by the subclass (inherited from))
 */
import java.io.*;

// [Example 1.0]
abstract class AnimalClass {
    // abstract method
    public abstract void animalSound();
    // regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class CatClass extends AnimalClass {
    public void animalSound() {
        System.out.println("The cat says: xue hua piao piao");
    }
}


// [Example 2.0]
abstract class Sunstar {
    abstract void printInfo();
}

class Employee extends Sunstar {
    void printInfo() {
        String name = "Lain";
        int age = 21;
        float salary = 333.3F;

        System.out.println("%% Name: " + name);
        System.out.println("%% Age: " + age);
        System.out.println("%% Salary: " + salary);
    }
}


// [Example 3.0]
abstract class Subject {
    Subject() {
        System.out.println("\n%%% Learning subject...");
    }
    abstract void syllabus();

    void learn() {
        System.out.println("%%% Preparing right now!");
    }
}

class IT extends Subject {
    void syllabus() {
        System.out.println("\tPython, Java, C/C#");
    }
}


// [Example 4.0]
abstract class Base {
    Base() {
        System.out.println("\n>>> Base constructor called!");
    }
    abstract void fun();
}

class Derived extends Base {
    Derived() {
        System.out.println(">>> Derived constructor called!");
    }
    void fun() {
        System.out.println(">>> Derived method fun() called!");
    }
}

// [Example 5.0]-
abstract class AbstractEmployee {
    private String name;
    private String address;
    private int number;

    public AbstractEmployee(String name, String address, int number) {
        System.out.println("Constructing an employee!");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract double computePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

class Salary extends AbstractEmployee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public double computePay() {
        System.out.println("%% Computing salary pay for: " + getName());
        return salary / 52;
    }
}


// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class Abstraction {
    public static void main(String[] args) {
        // [Example 1.0]
        AnimalClass cat = new CatClass();
        cat.animalSound();
        cat.sleep();
        System.out.println();

        // [Example 2.0]
        Sunstar sunstar = new Employee();
        sunstar.printInfo();

        // [Example 3.0]
        Subject subject = new IT();
        subject.learn();
        subject.syllabus();

        // [Example 4.0]
        Base base = new Derived();
        base.fun();
        System.out.println();

        // [Example 5.0]
        AbstractEmployee employee = new Salary("Patrick Bateman", "New York", 911, 69000000);
        System.out.println("Salary: $" + employee.computePay());


    }
}


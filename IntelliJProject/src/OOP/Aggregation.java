package OOP;
import java.util.Set;
import java.util.HashSet;

public class Aggregation {

    // [Example 2.0]
    public static void printDetails(Student stud) {
        System.out.println("\n%%%%% STUDENT DETAILS %%%%%");
        System.out.println("> Name: " + stud.studName);
        System.out.println("> Reg No.: " + stud.regNo);
        System.out.println(" * Street No.: " + stud.address.streetNum);
        System.out.println(" * City: " + stud.address.city);
        System.out.println(" * Country: " + stud.address.country);
    }


    // [Example 4.0]
    public static void AssociationExample() {
        // Creating employee objects and initialising them
        EmployeeClass emp1 = new EmployeeClass("Kiryu Kazuma");
        EmployeeClass emp2 = new EmployeeClass("Majima Goro");

        // Defining an Employee set and initialising it to a hashset
        Set<EmployeeClass> employees = new HashSet<>();

        // Adding employees to a set
        employees.add(emp1);
        employees.add(emp2);

        // Creating a Bank object
        Bank bank = new Bank("HSBC");
        // Setting the employees for the Bank object
        bank.setEmployees(employees);

        // Traversing and displaying the bank employees
        System.out.println();
        for (EmployeeClass emp: employees) {
            System.out.println("* " + emp.getEmployeeName() + " belongs to " + bank.getBankName());
        }

    }

    public static void main(String[] args) {
        // [Example 1.0]
        Speed speed = new Speed();
        speed.setMax(120);
        Van van = new Van();

        van.setVin("VICECITY2026");
        van.setSpeed(speed);
        van.display();

        // [Example 2.0]
        Address address1 = new Address(22, "Tokyo", "Japan");
        Address address2 = new Address(33, "Morioh-cho", "Japan");
        Student jotaro = new Student(3, "Jotaro", address1);
        Student josuke = new Student(4, "Josuke", address2);
        printDetails(jotaro);
        printDetails(josuke);

        // [Example 3.0]
        AssociationExample();
    }
}
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

// [Example 1.0]
class Vehicle {
    private String vin;

    public String getVin() {
        return vin;
    }

    public void setVin(String thisVin) {
        this.vin = thisVin;
    }
}

class Speed {
    private double max;

    public double getMax() {
        return max;
    }

    public void setMax(double maxSpeed) {
        this.max = maxSpeed;
    }
}

class Van extends Vehicle {
    private Speed speed;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed newSpeed) {
        this.speed = newSpeed;
    }

    public void display() {
        System.out.println("\n%%%  Vin: " + this.getVin());
        System.out.println("%%%  Max speed: " + speed.getMax() + "mph");
    }
}


// [Example 2.0]
class Address {
    int streetNum;
    String city, country;

    Address(int sN, String city, String country) {
        this.streetNum = sN;
        this.city = city;
        this.country = country;
    }
}

class Student {
    int regNo;
    String studName;
    Address address;

    Student(int regNo, String studName, Address address) {
        this.regNo = regNo;
        this.studName = studName;
        this.address = address;
    }
}



// [Example 3.0]
class Bank {
    private String bankName;
    private Set<EmployeeClass> employees;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setEmployees(Set<EmployeeClass> employees) {
        this.employees = employees;
    }

    public Set<EmployeeClass> getEmployees() {
        return this.employees;
    }
}

class EmployeeClass {
    private String name;

    public EmployeeClass(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}



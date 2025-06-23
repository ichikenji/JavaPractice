public class ObjectsClasses2 {
    public static void main(String[] args) {
        // [Example 1.0]
        ClassDog dog1 = new ClassDog("German Shepherd", "Brown", 8);
        ClassDog dog2 = new ClassDog("Golden Retriever", "Golden", 5);
        dog1.printDetails();
        dog2.printDetails();
        System.out.println();

        // [Example 2.0]
        Puppy puppy1 = new Puppy();
        Puppy puppy2 = new Puppy();
        puppy1.setAge(3);
        puppy2.setAge(2);

        System.out.println(puppy1);
        System.out.println(puppy2);

        // [Example 3.0]
        ClassEmployee emp1 = new ClassEmployee("Jim Halpert");
        ClassEmployee emp2 = new ClassEmployee("Dwight Schrute");

        emp1.setEmpAge(25);
        emp1.setEmpDesignation("Sales Representative");
        emp1.setEmpSalary(68000);

        emp2.setEmpAge(35);
        emp2.setEmpDesignation("Assistant Regional Manager");
        emp2.setEmpSalary(68500);

        emp1.printEmployee();
        emp2.printEmployee();


        // [Example 4.0]
        ClassCat catObj = new ClassCat();
        System.out.println("\n\t[ Before modifying ]");
        catObj.printCat();

        catObj.breed = "Persian Cat";
        catObj.age = 3;
        catObj.color = "White";

        System.out.println("\n\t[ After modifying ]");
        catObj.printCat();

        // [Example 5.0]
        VarArgsDemo argsDemo = new VarArgsDemo();
        System.out.println();
        argsDemo.printMax(34, 3, 69, 3, 2, 56.5, 45);
        argsDemo.printMax(new double[]{1 ,2 ,3, 33, 4, 5});
    }
}
//!%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

// [Example 1.0]
class ClassDog {
    private String breed, color;
    private int age;

    ClassDog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public void printDetails() {
        System.out.println("\n%%%%% Dog details %%%%%");
        System.out.println("   Breed: " + this.breed);
        System.out.println("   Colour: " + this.color);
        System.out.println("   Age: " + this.age);
    }
}

// [Example 2.0]
class Puppy {
    public int age;

    Puppy() {
        this.age = 0;
    }

    // [Mutator method]
    public void setAge(int puppyAge) {
        this.age = puppyAge;
    }

    // [Accessor method]
    public int getAge() {
        return age;
    }

    public String toString() {
        return "* Age of puppy: " + getAge() + " years";
    }
}

// [Example 3.0]
class ClassEmployee {
    String name, designation;
    int age;
    double salary;

    ClassEmployee(String name) {
        this.name = name;
    }

    public void setEmpAge(int age) {
        this.age = age;
    }

    public void setEmpDesignation(String desc) {
        this.designation = desc;
    }

    public void setEmpSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("\n%%%%%%%%%% Employee details %%%%%%%%%%");
        System.out.println("   + Name: " + name);
        System.out.println("   + Age: " + age);
        System.out.println("   + Designation: " + designation);
        System.out.println("   + Salary: " + salary);
    }
}

// %%%%%  Example 4.0 %%%%%
class ClassCat {
    String breed = "British Shorthair";
    int age = 4;
    String color = "Grey";

    public void printCat() {
        System.out.println("========== Cat details ==========");
        System.out.println("   + Breed: " + breed);
        System.out.println("   + Age: " + age);
        System.out.println("   + Color: " + color);
    }
}

// %%%%% Example 5.0 %%%%%
class VarArgsDemo {
    public void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("\n!! [No argument passed] ");
            return;
        }
        double result = numbers[0];

        //!! [BAD PRACTICE]
        // for (int i = 1; i < numbers.length; i++)
        // if (numbers[i] > result)
        // result = numbers[i];
        // System.out.println("\n* Max value: " + result);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result  = numbers[i];
            }
        }
        System.out.println("* Max value: " + result);
    }

}
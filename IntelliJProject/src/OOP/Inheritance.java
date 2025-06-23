public class Inheritance {
    public static void main(String[] args) {
        // [Example 1.0]
        int num1 = 20;
        int num2 = 10;
        MyCalculation demo = new MyCalculation();
        demo.addition(num1, num2);
        demo.subtraction(num1, num2);
        demo.multiplication(num1, num2);
        demo.division(num1, num2);
        System.out.println();
        
        // [Example 2.0]
        Subclass subclass = new Subclass();
        subclass.executeMethod();
        System.out.println();
    
        // [Example 3.0]
        SubclassOsaka osaka = new SubclassOsaka(20);
        osaka.getAge();


    } 
}
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

// [Example 1.0]
class Calculation {
    int total;

    public void addition(int x, int y) {
        total = x + y;
        System.out.println("\n%%%  Sum of given integers: " + total);
    }

    public void subtraction(int x, int y) {
        total = x - y;
        System.out.println("%%%  Subtraction of given integers: " + total);
    }
}

class MyCalculation extends Calculation {
    public void multiplication(int x, int y) {
        total = x * y;
        System.out.println("%%%  Multiplication of given integers: " + total);
    }

    public void division(int x, int y) {
        total = x / y;
        System.out.println("%%%  Division of given integers: " + total);
    }
}


// [Example 2.0]
class SupaClass {
    int num = 20;

    public void display() {
        System.out.println(">>> Display method of SUPACLASS <<<");
    }
}

class Subclass extends SupaClass {
    int num = 10;

    public void display() {
        System.out.println(">>> Display method of SUBCLASS <<<");
    }

    public void executeMethod() {
        Subclass subclass = new Subclass();
        subclass.display();
        super.display();

        System.out.println("\t* Value num in SUBCLASS: " + subclass.num);
        System.out.println("\t* Value num in SUPACLASS: " + super.num);
    }
}


// [Example 3.0]
class SuperClassOsaka {
    int age;

    SuperClassOsaka(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("%%%  <Superclass> Value of age: " + age);
    }
}

class SubclassOsaka extends SuperClassOsaka {
    SubclassOsaka(int age) {
        super(age);
    }

    public void getAge() {
        super.getAge();
        System.out.println("%%%  <Subclass> Value of age: " + age);
    }
}
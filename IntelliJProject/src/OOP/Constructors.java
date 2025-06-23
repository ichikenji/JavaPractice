package OOP;

public class Constructors {
    public static void main(String[] args) {
        // [Example 1.0]
        DefaultConstructorClass thisObj = new DefaultConstructorClass();
        System.out.println("\n%%% num1: " + thisObj.num1);
        System.out.println("%%% num2: " + thisObj.num2);
    
        // [Example 2.0]
        NoArgsExample myObj = new NoArgsExample();
        System.out.println("\n%%% No-args num1: " + myObj.num1);
        System.out.println("%%% No-args num2: " + myObj.num2);    

        // [Example 3.0]
        ParameterisedConstruct args1 = new ParameterisedConstruct(3, 7);
        ParameterisedConstruct args2 = new ParameterisedConstruct(20, 33);
        System.out.println("\n%%% [num1]: " + args1.num1 + " - [num2]: " + args1.num2);
        System.out.println("%%% [num1]: " + args2.num1 + " - [num2]: " + args2.num2);
        

        // [Example 4.0]
        ConstructOverload ichiko = new ConstructOverload("Ichiko Aoba", "Japanese", 35);
        ConstructOverload leslie = new ConstructOverload();
        ConstructOverload moeka = new ConstructOverload("Moeka Giga", null, 0);
        ichiko.printDetails();
        leslie.printDetails();
        moeka.printDetails();
    }
}

class DefaultConstructorClass {
    // No constructor to pass arguments were made
    // So, a default constructor will be invoked 
    int num1, num2;
}

class NoArgsExample {
    int num1, num2;

    NoArgsExample() {
        num1 = -1;
        num2 = -1;
    }
}

class ParameterisedConstruct {
    int num1, num2;

    ParameterisedConstruct(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

class ConstructOverload {
    String artist, language;
    int age;

    // Default constructor (No-args)
    ConstructOverload() {
        this.artist = "Unknown artist";
        this.language = "Unknown language";
        this.age = 0;
    }

    ConstructOverload(String artist, String lang, int age) {
        this.artist = artist;
        this.language = lang;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("\n%%%%% Artist Details %%%%%");
        System.out.println("   + Artist: " + artist);
        System.out.println("   + Language: " + language);
        System.out.println("   + Age: " + age);
    }
}
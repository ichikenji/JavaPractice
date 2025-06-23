public class InterfaceJava {
    public static void main(String[] args) {    
        // [Example 1.0]
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
        System.out.println();

        // [Example 2.0]
        DemoClass demo = new DemoClass();
        demo.firstMethod();
        demo.secondMethod();
        
        // [Example 3.0]
        BicycleClass bicycle = new BicycleClass();
        bicycle.changeGear(2);
        bicycle.speedUp(5);
        bicycle.applyBrakes(2);
        bicycle.printStates();

        Window window = new Window(40, 50);
        System.out.println(window.toString());
    }
}

// [Example 1.0]
interface AnimalInterface {
    public void animalSound();
    public void sleep();
}

class Pig implements AnimalInterface {
    public void animalSound() {
        System.out.println("\nThe pig says: Xue hua piao piao");
    }

    public void sleep() {
        System.out.println("The pig go sleep");
    }
}


// [Example 2.0]
interface FirstInterface {
    public void firstMethod();
}

interface SecondInterface {
    public void secondMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void firstMethod() {
        System.out.println("%% First method of first interface called!");
    }

    public void secondMethod() {
        System.out.println("%% Second method of second interface called!");
    }
}


// [Example 3.0]
interface VehicleInterface {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class BicycleClass implements VehicleInterface {
    int speed, gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("[Gear]: " + gear + "  | [Speed]: " + speed);
    }
}


// [Example 4.0]
interface Resizable {
    Window resize(int width, int height);
}

class Window implements Resizable {
    private int width, height;

    Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Window resize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return "Window size: " + width + 'x' + height;
    }
}
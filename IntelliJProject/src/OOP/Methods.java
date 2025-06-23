public class Methods {

    // %%% Example 1.0 (Example of Method Overloading) %%%
    public static int minFunction(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("\n%%% At least one integer is required~");
        } 
        int min = numbers[0];
        for (int num: numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static String minFunction(String... strings) {
        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("\n%%% At least one word is required~");
        }
        String min = strings[0];
        if (min == null) {
            // Iterate through the strings to find the first non-null string
            for (String string: strings) {
                if (string != null) {
                    min = string;
                    break;
                }
            }
            // Checks if all strings are null
            if (min == null) {
                return null;
            }
        }
        // Iterate through the strings to find the minimum
        for (String string: strings) {
            if (string != null && string.compareTo(min) < 0) {
                min = string;
            }
        }
        return min;
    }



    // %%% Example 2.0 %%%
    public static void swapFunction(int a, int b) {
        System.out.println("\n%%% Before swapping: [a = " + a + ", b = " + b + "]");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("%%% After swapping: [a = " + a + ", b = " + b + "]");
    }


// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
        // [Example 1.0]
        int minInt = minFunction(11, 6, 34, 2, 9);
        System.out.println("\n%%% Minimum value (Int array): " + minInt);

        String minString = minFunction("Omni-man", "Invincible", "Cecil", "Thragg", "Debbie");
        System.out.println("%%% Minimum value (String array): " + minString);
        
        // [Example 2.0]
        int a = 20;
        int b = 33;
        swapFunction(a, b);

        // [Example 3.0]
        ExampleClass thisObj = new ExampleClass();
        thisObj.printName();
    }
}


// %%% Example 3.0 ###
class ExampleClass {
    String cecil = "SEA SALT";

    ExampleClass() {
        System.out.println("\n%%%%%%%%% Called the class! %%%%%%%%%%%%%%%");
    }

    ExampleClass(String cecil) {
        this();
        this.cecil = cecil;
    }

    public void greet() {
        System.out.println("\t<Mark> SEA SALT! I NEED YOU SEA SALT!");
        System.out.println("\t<Nolan> Are you sure?");
    }

    public void printName() {
        String cecil = "Sea salting it rn";
        String nolan = "Are you sure?";
        System.out.println("\t<Local Cecil> " + cecil);
        System.out.println("\t<Instance Cecil> " + this.cecil);
        System.out.println("\t<Local Nolan> " + nolan);
        this.greet();
    }
}



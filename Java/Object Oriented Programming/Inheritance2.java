/**
 * 
 * Andreu Garcies Ramon 19-10-2021
 * 
 * Write the following code:
 *  1- A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
 *  2- A class named Adder that inherits from a superclass named Arithmetic.
 * 
 * INPUT FORMAT:
 * You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.
 * 
 * OUTPUT FORMAT:
 * You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.
 * 
 * */

class Arithmetic {
    int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Adder extends Arithmetic {
}

public class Inheritance2 {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
        System.out.printf("%d %d %d\n", adder.add(10, 32), adder.add(10, 3), adder.add(10, 10));
    }
}

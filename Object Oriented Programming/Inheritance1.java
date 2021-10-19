/**
 * 
 * Andreu Garcies Ramon 19-10-2021
 * 
 * Using inheritance, one class can acquire the properties of others. Consider the following animal class:
 */

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

/**
 * This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
 */

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
    
    void sing() {
        System.out.println("I am singing");
    }
}

/**
 * You must add a sing method to the Bird class.
 */
public class Inheritance1 {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();
    }
}

/**
 * Andreu Garcies Ramon 20-10-2021
 * 
 * When a method in a subclass overrides a method in a superclass, it is still possible to call the overrideden method using super
 * keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.
 * 
 * EXPECTED OUTPUT:
 * Hello I am a motorcycle, I am a cycle with an engine.
 * My ancestor is a cycle who is a vehicle with pedals.
 * */

class Bycicle {
    String define() {
        return "a vehicle with pedals.";
    }
}


class Motorcycle extends Bycicle {
    @Override
    String define() {
        return "a cycle with an engine.";
    }

    String getSuperDefinition() {
        return super.define();
    }

}

public class MethodOverridingSuper {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("Hello I am a motorcycle, I am " + motorcycle.define());
        System.out.println("My ancestor is a cycle who is " + motorcycle.getSuperDefinition());
    }
}

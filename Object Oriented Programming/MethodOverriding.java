/**
 * 
 * Andreu Garcies Ramon 19-10-2021
 * 
 * When a subclass inherits from a superclass, it also inherits its methods; however, it can also
 * override the superclass methods (as well as declare and implement new ones).
 * 
 * Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s)
 * and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
 * 
 * Write an overridden method for the getNumberOfTeamMembers() form the Sports class, that prints the same sentence
 * except that it replaces n with 11 (the number of players on a Soccer team)
 */

class Sports {
    String getName() { return "Generic Sports"; }

    void getNumberOfTeamMembers() {
        System.out.printf("Each team has n players in %s\n", getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() { return "Soccer Class"; }

    @Override
    void getNumberOfTeamMembers() {
        System.out.printf("Each team has 11 players in %s\n",  getName());
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Sports sportClass = new Sports();
        Soccer soccerClass = new Soccer();
        System.out.println(sportClass.getName());
        sportClass.getNumberOfTeamMembers();
        System.out.println(soccerClass.getName());
        soccerClass.getNumberOfTeamMembers();

    }
}

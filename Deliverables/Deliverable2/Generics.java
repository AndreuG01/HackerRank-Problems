import java.util.ArrayList;
import java.util.List;

/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * Generic methods are a very efficient way to handle multiple datatypes using a single method.
 * This problem will test your knowledge on Java Generic methods.
 * Let's say you have an integer array and a string array. You have to write a single method printArray
 * that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
 * 
 * Do not use method overloading because your anwer will not be accepted.
 */
public class Generics<GenericType> {
    
    public static void main(String[] args) {
        GenericClass<Integer> intArray = new GenericClass<Integer>();
        for (int i = 0; i < 3; i++) {
            intArray.addAttribute(i + 1);
        }

        GenericClass<String> stringArray = new GenericClass<String>();
        stringArray.addAttribute("Hello");
        stringArray.addAttribute("World");

        intArray.printAttributes();
        stringArray.printAttributes();



    }
}

class GenericClass<GenericType> {
    private List<GenericType> attributes;

    public GenericClass() {
        attributes = new ArrayList<GenericType>();
    }

    public void addAttribute(GenericType attribute) {
        attributes.add(attribute);
    }

    public void printAttributes() {
        for (GenericType attribute: attributes) {
            System.out.println(attribute);
        }
    }
}



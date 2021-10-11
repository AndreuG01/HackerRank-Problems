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

public class Generics {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3}; // we can not use int since it is not a subtype of Object. Integer is a subtype of Object.
        String[] stringArray = {"Hello", "World"};

        printGenericArray(intArray);
        printGenericArray(stringArray);



    }

    private static void printGenericArray(Object[] array) {
        for (Object object: array) {
            System.out.println(object);
        }
    }
}

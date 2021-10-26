import java.util.*;

/**
 * Andreu Garcies Ramon 26-10-2021
 * 
 * Java Iterator class can help you to iterate through every element in a collection.
 * In this problem you need to complete a method func. The method takes an ArrayList as
 * input. In that ArrayList there is one or more integer numbers, then there is a special
 * string "###", after that there are one or more other strings. A sample ArrayList may look like this:
 * 
 *      element[0]=>42
 *      element[1]=>10
 *      element[2]=>"###"
 *      element[3]=>"Hello"
 *      element[4]=>"Java"
 * 
 * The program has to print the elements after the special string "###".
 * Note: The stdin doesn't contain the string "###", it is added in the main method.
 * 
 * INPUT FORMAT: two numbers denoting the ammount of integers and strings that the array will have
 * and the corresponding data.
 * 
 * OUTPUT FORMAT: the program has to print all the strings in the array. 
 * */

public class JavaIterator {

    static Iterator<Object> prepareIterToPrint(ArrayList<Object> list) {
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof String) {
                break;
            }
        }
        return iterator;
    }
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);

        int numIntegers = scanner.nextInt();
        int numStrings = scanner.nextInt();

        // Adding all the numbers to the array
        for (int i = 0; i < numIntegers; i++) {
            list.add(scanner.nextInt());
        }
        
        // Adding the "###" string
        list.add("###");

        // Adding all the strings to the list
        for (int i = 0; i < numStrings; i++) {
            list.add(scanner.next());
        }

        Iterator<Object> iter = prepareIterToPrint(list);
        while (iter.hasNext()) {
            Object element = iter.next();
            System.out.println((String)element);
        }


        
        scanner.close();

    }
}

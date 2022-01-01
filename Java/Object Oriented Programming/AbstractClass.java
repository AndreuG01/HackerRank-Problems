/**
 * 
 * Andreu Garcies Ramon 19-11-2021
 * 
 * A Java abstract class is a class that can't be instantiated. That means you cannot create new instances
 * of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge.
 * 
 */

import java.util.Scanner;

/**
 * Following is an example of abstract class:
 */

abstract class Book {
    String title;
    abstract void setTitle(String title);
    String getTitle() { return this.title; }
}
/**
 * If you try to create an instance of this class like the following line you will get an error:
 * 
 * You have to create another class that extends the abstract class. Then you can create an instance of the new
 * class. Notice that setTitle method is abstract too and has no body. That means you must implement the body
 * of that method in the child class. In the editor, we have provided the abstract Book class and a Main class.
 * In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
 * Your class mustn't be public.
 * 
 * SAMPLE INPUT: A tale of two cities
 * SAMPLE OUTPUT: The title is: A tale of two cities
*/

class MyBook extends Book {
    void setTitle(String title) { this.title = title; }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookTitle = scan.nextLine();

        MyBook book = new MyBook();   
        book.setTitle(bookTitle);

        System.out.printf("%s%s\n", "The title is: ", book.getTitle());
        
        
        scan.close();
    }

}

import java.util.Scanner;

public class ReadSTDIN {
    public static void main(String[] args) {
        /** This program reads input from the Stdin
         * It is done using the Scanner class. Alternatively, we can use the BufferReader class.
         */

         Scanner scan = new Scanner(System.in); // We create a scanner object that will read from Stdin
         
         // Reading three different numbers
         int a = scan.nextInt();
         int b = scan.nextInt();
         int c = scan.nextInt();

         // Once we have finished reading from Stdin, we have to close the scanner object
         scan.close();

         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}

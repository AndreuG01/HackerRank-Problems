/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 * 
 * INPUT FORMAT: Read some unknown  nlines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 * 
 * OUTPUT FORMAT: For each line, print the line number, followed by a single space, and then the line content received as input.
 * 
 */

import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr;
        int counter = 1;
        while (scan.hasNext()) {
            inputStr = scan.nextLine();
            System.out.println(counter + " " + inputStr);
            counter += 1;
        }
        
        scan.close();
    }
}

import java.util.Scanner;

/**
 * Java's System.out.printf function can be used to print formatted output.
 * The purpose of this exercise is to test your understanding of formatting output using printf.
 * 
 * INPUT FORMAT: every line of input will contain a String followed by an integer. Each string will
 * have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999
 * 
 * OUTPUT FORMAT: in each line of output there should be two columns:
 * 1. The first column contains the String and is left justified using exactly 15 characters.
 * 2. The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three
 *    digits, you must pad your output's leading digits with zeroes.
 */

public class FormattingOutput {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");
        
        for (int i = 0; i < 3; i++) {
            String languageName = scan.next(); // Scanning the name of the language
            int number = scan.nextInt();

            // now we have to know the length of the string to know how many blank spaces we have to print.
            int lengthString = languageName.length();
            int numberWhiteSpaces = 15 - lengthString;
            int numberZeros = 3 - FormattingOutput.numberDigits(number);

            System.out.print(languageName);
            for (int spaces = 0; spaces < numberWhiteSpaces; spaces++) { // Printing the white spaces
                System.out.print(" ");
            }
            for (int zeros = 0; zeros < numberZeros; zeros++) { // Printing the zeros
                System.out.print("0");
            }

            System.out.println(number);
        
        }

        scan.close();
        System.out.println("================================");
    }

    public static int numberDigits(int number) {
        if (number / 10 == 0) {
            return 1;
        } else {
            return 1 + numberDigits(number / 10);
        }
    }
}
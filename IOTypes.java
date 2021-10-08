import java.util.Scanner;

/**
 * In this challenge, you must read an integer, a double, and a String from stdin,
 * then print the values according to the instructions in the Output Format section below.
 * 
 * INPUT FORMAT: there are three lines of input:
 * 1. The first line contains an integer.
 * 2. The second line contains a double.
 * 3. The third line contains a String.
 * 
 * OUTPUT FORMAT: there are three lines of output:
 * 1. On the first line, print String: followed by the unaltered String read from stdin.
 * 2. On the second line, print Double: followed by the unaltered double read from stdin.
 * 3. On the third line, print Int: followed by the unaltered integer read from stdin.
 * 
 * NOTE: If you use the nextLine() method immediately following the nextInt() method, recall
 * that nextInt() reads integer tokens; because of this, the last newline character for that
 * line of integer input is still queued in the input buffer and the next nextLine() will be
 * reading the remainder of the integer line (which is empty).
 */

public class IOTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integerNumber = scan.nextInt();
        double doubleNumber = scan.nextDouble();
        scan.nextLine(); // scanning the newline character
        String str = scan.nextLine();

        
        scan.close();

        System.out.println("String: " + str);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + integerNumber);

        /** 
         * IMPORTANT NOTE: when inputing a double throug the terminal, use the ",". For example:
         * pi = 3,1415 (even if it is then printed 3.1415)
        */
    }
}

/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * You are given an integer n, you have to convert it into a string.
 * Please complete the partially completed code in the editor.
 * If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
 * n can range between -100 to 100 inclusive.


 * 
 */

import java.util.Scanner;

public class IntToString {
    // This solution reads the number as a string and converts it into an integer
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputStr = scan.nextLine();

        try {
            Integer.parseInt(inputStr);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
        
        scan.close();
    }

    // This soulution reads the number as an integer and converts it into a string
    /* private static void intToString() {
        Scanner scan = new Scanner(System.in);

        try {
            int number = scan.nextInt();
            String strNum = Strig.valueOf(number);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }

        scan.close();
    
    } */
}

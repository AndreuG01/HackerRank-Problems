/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise,
 * we'll work with the primitives used to hold integer values (byte, short, int, and long):
 *  · A byte is an 8-bit signed integer.
 *  · A short is a 16-bit signed integer.
 *  · An int is a 32-bit signed integer.
 *  · A long is a 64-bit signed integer.
 * 
 * Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 * 
 * INPUT FORMAT: The first line contains an integer, T, denoting the number of test cases.
 * Each test case, T, is comprised of a single line with an integer, n, which can be arbitrarily large or small.
 * 
 * OUTPUT FORMAT: For each input variable n and appropriate primitive dataType, you must determine if the given primitives
 * are capable of storing it. If yes, then print:
 *      n can be fitted in:
 *      * dataType
 * If there is more than one appropriate data type, print each one on its own line and order them by size
 * (i.e.: byte < short < int < long).
 * If the number cannot be stored in one of the four aforementioned primitives, print the line:
 *      n can't be fitted anywhere.
 * 
 * */

import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberQueries = scan.nextInt();

        for (int i = 0; i < numberQueries; i++) {
            try {
                long currentNumber = scan.nextLong(); // The type is long since it is the highest datatype
                System.out.println(currentNumber + " can be fitted in:");
                canFit(currentNumber);
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }

        scan.close();
    }

    private static void canFit(long number) {
        if (number >= -128 && number <= 127) {
            System.out.println("* byte");
        }
        if (number >= -Math.pow(2, 15) && number <= Math.pow(2, 15) - 1) {
            System.out.println("* short");
        }
        if (number >= -Math.pow(2, 31) && number <= Math.pow(2, 31) - 1) {
            System.out.println("* int");
        }
        if (number >= -Math.pow(2, 63) && number <= Math.pow(2, 63) - 1) {
            System.out.println("* long");
        }
    }
}

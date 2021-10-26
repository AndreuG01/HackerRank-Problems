/**
 * Andreu Garcies Ramon 26-10-2021
 * 
 * The elements of a String are called characters. The number of characters in a String is called the
 * length, and it can be retrieved with the String.length() method.
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * 
 *  1. Sum the lengths of A and B.
 *  2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
 *  3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
 * 
 * INPUT FORMAT:
 * The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.
 * 
 * OUTPUT FORMAT:
 * There are three lines of output:
 *  1. For the first line, sum the lengths of A and B.
 *  2. For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 *  3. For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
 * 
 *  */

import java.util.*;

public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstString = scan.next();
        String secondString = scan.next();

        int totalLengthStrings = firstString.length() + secondString.length();
        System.out.println(totalLengthStrings);

        if (firstString.compareTo(secondString) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        // CAPITALIZING the first string
        String firstStringCapitalized = firstString.substring(0, 1).toUpperCase() + firstString.substring(1);
        String secondStringCapitalized = secondString.substring(0, 1).toUpperCase() + secondString.substring(1);
        System.out.printf("%s %s\n",  firstStringCapitalized, secondStringCapitalized);

        scan.close();
    }
}

/**
 * Andreu Garcies Ramon 14-11-2021
 * 
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 *  
 */

import java.util.*;

public class StringsReverse {
    private static String reverse(String toReverse) {
        String reversedString = "";
        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversedString += toReverse.charAt(i);
        }

        return reversedString;
    }

    private static boolean isPalindrome(String firstWord, String SecondWord) {
        if (firstWord.compareTo(SecondWord) == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String analyzeWord = scanner.next();
        String reversedWord = reverse(analyzeWord);

        if (isPalindrome(analyzeWord, reversedWord) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();

    }
}

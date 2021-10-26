/**
 * Andreu Garcies Ramon 26-10-2021
 * 
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.
 * 
 * INPUT FORMAT:
 *  1. The first line contains a string denoting .
 *  2. The second line contains an integer denoting k.
 * 
 * OUTPUT FORMAT:
 * Print the smallest substring and the largest substring of length k.
 * */

import java.util.Scanner;

public class SubstringComparison {
    
    public static String getSmallestAndLargestSubstring(String inputString, int k) {
        String smallest = inputString.substring(0, k);
        String largest = inputString.substring(0, k);
        for (int i = 0; i < inputString.length() - k + 1; i++) {
            String substring = inputString.substring(i, i + k);
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            } else if (substring.compareTo(largest) >= 0) {
                largest = substring;
            }
        }
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        int k = scanner.nextInt();

        System.out.println(getSmallestAndLargestSubstring(inputString, k));


        scanner.close();
    }
}

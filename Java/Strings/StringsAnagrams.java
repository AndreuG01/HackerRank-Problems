/**
 * Andreu Garcies Ramon 14-11-2021
 * 
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
 * For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
 * Determine if two given strings are anagrams or not.
 * 
 * INPUT FORMAT:
 * 1- The first line contains a string a.
 * 2- The second line contains a string b.
 * 
 */

import java.util.*;

public class StringsAnagrams {
    private static boolean isAnagram(String str1, String str2) {
        // We want the program not to be case-sensitive, so we convert both strings to lowecase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Data structure where the frequency of each character will be stored
        Map<Character, Integer> hashMap = new HashMap<>();
        if (str1.length() != str2.length()) {
            // If the lengths are not the same, there is no need in checking anything else
            return false;
        }

        // Filling the map with the frequency of each letter in the first string
        for (int i = 0; i < str2.length(); i++) {
            Character currentChar = str1.charAt(i);
            
            if (hashMap.containsKey(currentChar)) {
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                hashMap.put(currentChar, 1);
            }
        }

        // Checking the frequency of each character of the second string using the previously filled hasmap
        for (int i = 0; i < str2.length(); i++) {
            Character currentChar = str2.charAt(i);

            if (hashMap.containsKey(currentChar) == false) {
                return false;
            } else {
                hashMap.put(currentChar, hashMap.get(currentChar) - 1);
                if (hashMap.get(currentChar) == 0) {
                    hashMap.remove(currentChar);
                }
            }
        }


        return hashMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();
        String secondString = scanner.next();

        scanner.close();

        if (isAnagram(firstString, secondString)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams"); 
        }
    }
}

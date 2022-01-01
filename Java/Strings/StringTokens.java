/**
 * Andreu Garcies Ramon 14-11-2021
 * 
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the number
 * of tokens, followed by each token on a new line.
 * 
 * INPUT FORMAT: A single string, s
 * OUTPUT FORMAT: On the first line, print an integer, n, denoting the number of tokens in string s
 * (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s.
 * 
 * */

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String trimmedSentence = sentence.trim();

        if (trimmedSentence.length() != 0) {
            // trim() is used to remove the white spaces of the beginning and end of the string
            String[] sentenceWords = trimmedSentence.split("[ !,?._'@]+");
        
            System.out.println(sentenceWords.length);
            for (int i = 0; i < sentenceWords.length; i++) {
                System.out.println(sentenceWords[i]);
            }

        } else {
            System.out.println(trimmedSentence.length());
        }
        
        scanner.close();
    }
}

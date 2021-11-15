/**
 * Andreu Garcies Ramon 15-11-2021
 * 
 * Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern,
 * we have to specify one using some well-defined syntax. In this problem, you are given a pattern.
 * You have to check whether the syntax of the given pattern is valid.
 *
 * INPUT FORMAT:The first line of input contains an integer N, denoting the number of test cases. The next
 * N lines contain a string of any printable characters representing the pattern of a regex.
 * 
 * OUTPUT FORMAT: For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
 * 
 */

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // if we use scanner.nextInt(); to obtain the integer number, the "\n" character will
        // remain in the buffer and it will be considered as the first string that we input
        int numTestCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numTestCases; i++) {
            String pattern = scanner.nextLine();
            // The function compile() does not return any value. If the expression that it receives is incorrect,
            // it throws a PatternSyntaxException. Therefore, the only thing that we have to do is to caputre this
            // exception in case that it is thrown and print the corresponding message.
            try {
                Pattern.compile(pattern);
                // The pattern received by compile() has not thrown any exception.
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }    
}
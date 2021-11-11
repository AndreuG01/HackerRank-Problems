/**
 * Andreu Garcies Ramon 10-10-2021
 * 
 * A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2.
 * if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * Given a string, determine if it is balanced or not.
 * 
 * INPUT FORMAT:
 * There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
 * The part of the code that handles input operation is already provided in the editor.
 * 
 * OUTPUT FORMAT: For each case, print 'true' if the string is balanced, 'false' otherwise.
 * 
 * 
 *  */

import java.io.*;
import java.util.Stack;


public class JavaStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<Character>();

        String inputStr = bufferReader.readLine();
        while (inputStr != null && inputStr != "") { // reading lines until the end of file is found (in case the input comes from a file)
        // or until an empty string is found (in case the input comes from the command line)
            
            boolean isCorrect = isBalanced(inputStr, stack);
            if (isCorrect == true) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            stack.clear();

            inputStr = bufferReader.readLine();
        }

        bufferReader.close();
    }

    public static boolean isBalanced(String str, Stack<Character> stack) {
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);
            if (Character.compare(currentChar, ')') == 0) {
                if (stack.isEmpty() == true) return false;
                if (Character.compare(stack.peek(), '(') == 0) {
                    stack.pop();
                }
            } else if (Character.compare(currentChar, ']') == 0) {
                if (stack.isEmpty() == true) return false;
                if (Character.compare(stack.peek(), '[') == 0) {
                    stack.pop();
                }
            } else if (Character.compare(currentChar, '}') == 0) {
                if (stack.isEmpty() == true) return false;
                if (Character.compare(stack.peek(), '{') == 0) {
                    stack.pop();
                }
            } else {
                stack.push(currentChar);
            }
        }

        return stack.isEmpty();
    }
}

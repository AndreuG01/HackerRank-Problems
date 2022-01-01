/**
 * Andreu Garcies Ramon 26-10-2021
 * 
 * Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end - 1.
 * 
 * INPUT FORMAT:
 *      1. The first line contains a single string denoting s.
 *      2. The second line contains two space-separated integers denoting the respective values of start and end.
 * 
 * OUTPUT FORMAT:
 * Print the substring in the inclusive range from start to end - 1.
 * 
 *  
 */

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inpuString = scanner.next();
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        System.out.println(inpuString.substring(firstIndex, secondIndex));

        scanner.close();
    }
}

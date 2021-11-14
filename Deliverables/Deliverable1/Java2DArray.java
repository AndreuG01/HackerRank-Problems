/**
 * Andreu Garcies Ramon 08-10-2021
 * 
 * You are given a 6 * 6 2D array. An hourglass in an array is a portion shaped like this:
 * a b c
 *   d 
 * e f g
 * 
 * Consider the following matrix
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * There are many hourglasses in the array before. The three leftmost are the following:
 *  1 1 1     1 1 0     1 0 0
 *    1         0         0
 *  1 1 1     1 1 0     1 0 0
 * 
 * The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses
 * above are 7, 4 and 2 respectively. In this problem you have to print the largest sum among the 
 * hourglasses in the array.
 * 
 * INPUT FORMAT: There will be exactly 6 lines, each containing 6 integers separated by spaces.
 * Each integer will be between -9 and 9 inclusive
 * 
 * OUTPUT FORMAT: Print the answer to the problem on a single line
 */

import java.io.IOException;
import java.util.Scanner;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int numLines = 6;
        int[][] array = new int[numLines][numLines];

        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numLines; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        System.out.println(hourglass(array));

        scan.close();
    }

    public static int hourglass(int[][] array) {
        int result = 0;
        int greatestResult = -10 * array.length; // Since the smallest value is -9, the smallest sum can be -9 * 6 = -54.
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                result = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (result > greatestResult) {
                    greatestResult = result;
                }
            }
            

        }
        return greatestResult;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
/**
 * A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
 * For example, if array = [1, 2, 3], then the subarrays are [1], [2], [3], [1, 2], [1, 3], [2, 3] and [1, 2, 3].
 * Something like [1, 3] would not be a subarray as it is not a contiguous subsection of the original array.
 * 
 * The sum of an array is the total sum of its elements.
 *      If the sum is negative, the array's sum is negative
 *      If the sum is positive, the array's sum is positive.
 * given an array of n integers, find and print its number of negative subarrays on a new line.
 * 
 * INPUT FORMAT:
 * 1. The first line contains a single integer, n, denoting the length of the array.
 * 2. The second line contains n space-separated integers describing each respective element, a_i in the array.
 * 
 * OUTPUT FORMAT: print the number of subarrays of A having negative results.
 */

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrayElements = scan.nextInt();
        int[] array = new int[arrayElements];
        

        // Filling the array with all the elements
        for (int i = 0; i < arrayElements; i++) {
            array[i] = scan.nextInt();
        }

        

        int negativeSubArrays = 0;
        int addition = 0;
        for (int i = 0; i < arrayElements; i++) {
            addition = 0; // Each time we change element we have to reset the value of the addition to 0
            for (int j = i; j < arrayElements; j++) { // Consider [1, 2, 3] -> [2, 1] is not a subarray. For this reason, j = 1.
               addition += array[j];
               if (addition < 0) {
                   negativeSubArrays += 1;
               }
            }
        }

        System.out.println(negativeSubArrays);

        scan.close();
    }

}

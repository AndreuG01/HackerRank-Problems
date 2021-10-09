/**
 * Andreu Garcies Ramon 08-10-2021
 * 
 * INPUT FORMAT: The first line contains a single integer, n, denoting the size of the array.
 * Each line i of the subsequent lines contains a single integer denoting the value of the element a_i
 * 
 * OUTPUT FORMAT: You are not responsible for printing any output to stdout. (Even though, I have implemented this)
 */

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class Java1DArray {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferReader.readLine().trim());
        
        int[] newArray = new int[n];
        int currentElement;

        for (int i = 0; i < n; i++) {
            currentElement = Integer.parseInt(bufferReader.readLine().trim());
            newArray[i] = currentElement;
        }

        printArray(newArray);

        bufferReader.close();
    }

    public static void printArray(int[] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.println(printArray[i]);
        }
    }
}
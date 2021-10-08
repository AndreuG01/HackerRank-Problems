/**
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature.
 * Try to solve this problem using Arraylist. You are given n lines. In each line there are zero or more
 * integers. You need to answer a few queries where you need to tell the number located in yth position of xth line.
 * Take your input from System.in.
 * 
 * INPUT FORMAT: The first line has an integer n. In each of the next n lines there will be an integer d denoting number
 * of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q
 * denoting number of queries. Each query will consist of two integers x and y.
 * 
 * OUTPUT FORMAT: In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
 */

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numArrays = scan.nextInt();
        
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < numArrays; i++) {
            int numElements = scan.nextInt();
            ArrayList<Integer> currentArray = new ArrayList<Integer>();
            for (int j = 0; j < numElements; j++) {
                currentArray.add(scan.nextInt());
            }
            arrays.add(i, currentArray);
        }

        int numberQueries = scan.nextInt();
        
        for (int i = 0; i < numberQueries; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            if (arrays.get(x).size() > y) {
                System.out.println(arrays.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }

        scan.close();

    }
}

/**
* Andreu Garcies Ramon 10-10-2021
*
* In computer science, a set is an abstract data type that can store certain values, without any particular order,
* and no repeated values(Wikipedia). {1, 2, 3} is an example of a set, but {1, 2, 2} is not a set. Today you will
* learn how to use sets in java by solving this problem.
* 
* You are given  pairs of strings. Two pairs (a, b) and (c, d) are identical if a = c and b = d. That also implies (a, b) is not same as (b, a).
* After taking each pair as input, you need to print number of unique pairs you currently have.
* 
* INPUT FORMAT: In the first line, there will be an integer T denoting number of pairs. Each of the next T lines will contain two strings seperated by a single space.
* 
* OUTPUT FORMAT: Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
*
* 
*/


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;


public class JavaHashSet {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int totalPairs = scan.nextInt();
        int pairCounter = 0;

        HashSet<String> hashSet = new HashSet<String>();


        for (int i = 0; i < totalPairs; i++) {
            String element1 = scan.next();
            String element2 = scan.next();
            String pair = element1 + " " + element2;
            if (hashSet.contains(pair) == false) {
                hashSet.add(pair);
                pairCounter += 1;
            }

            System.out.println(pairCounter);
        }
        
        scan.close();

    }
}

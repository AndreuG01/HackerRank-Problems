/**
 * Andreu Garcies Ramon 10-10-2021
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

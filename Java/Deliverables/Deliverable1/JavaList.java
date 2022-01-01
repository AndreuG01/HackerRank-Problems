/**
 * Andreu Garcies Ramon 09-10-2021
 * 
 * For this problem, we have 2 types of queries you can perform on a List:
 * 1. Insert y at index x:
 *  Insert
 *  x y
 * 2. Delete the element at index x:
 *  Delete
 *  x
 * 
 * Given a list, L, of N integers, perform Q queries on the list. Once all queries are
 * completed, print the modified list as a single line of space-separated integers.
 * 
 * INPUT FORMAT:
 * The first line contains an integer, N (the initial number of elements in L).
 * The second line contains N space-separated integers describing L.
 * The third line contains an integer, Q (the number of queries).
 * The 2Q subsequent lines describe the queries, and each query is described over two lines:
 * 
 *  If the first line of a query contains the String Insert, then the second line contains two
 *  space separated integers x y, and the value y must be inserted into L at index x.
 *  
 *  If the first line of a query contains the String Delete, then the second line contains index
 *  x, whose element must be deleted from L.
 * 
 * OUTPUT FORMAT: Print the updated list L as a single line of space-separated integers.
 *  
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int elementsList = scan.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        
        // Filling the list.
        for (int i = 0; i < elementsList; i++) {
            list.add(scan.nextInt());
        }

        int numberOfQueries = scan.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            String operation = scan.next();
            if (operation.equals("Insert")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x, y);
            } else if (operation.equals("Delete")) {
                int x = scan.nextInt();
                list.remove(x);
            }
        }

        JavaList.printList(list);

        scan.close();
    }

    public static void printList(List<Integer> printList) {
        for (int i = 0; i < printList.size(); i++) {
            System.out.print(printList.get(i) + " ");
        }
        System.out.println("");
    }
}

/**
 * Andreu Garcies Ramon 10-10-2021
 * 
 * You are given a phone book that consists of people's names and their phone number.
 * After that you will be given some person's name as query. For each query, print the phone number of that person.
 * 
 * INPUT FORMAT:
 * 1. The first line will have an integer n denoting the number of entries in the phone book.
 *    Each entry consists of two lines: a name and the corresponding phone number.
 * 2. After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
 * 
 * OUTPUT FORMAT:
 * For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and
 * phone number. See sample output for the exact format. To make the problem easier, we provided a portion of the code in
 * the editor. You can either complete that code or write completely on your own.
 * 
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        int numEntries = readInteger(bufferReader);

        Map<String, Integer> map = new HashMap<String, Integer>();

        

        for (int i = 0; i < numEntries; i++) {
            String name = bufferReader.readLine();
            int number = readInteger(bufferReader);
            map.put(name, number);
        }

        String query = bufferReader.readLine();
        while (query != null || query == "") { // query != null is because Hacker rank reads from files.
                                               // query == "" is in case that we run the program from the command line.
            
            if (map.containsKey(query) == true) {
                System.out.println(query + "=" + map.get(query).intValue());
            } else {
                System.out.println("Not found");
            }
            query = bufferReader.readLine();
        }

        bufferReader.close();

    }

    public static int readInteger(BufferedReader buffer) throws IOException{
        return Integer.parseInt(buffer.readLine());
    }
}

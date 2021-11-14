/**
 * Andreu Garcies Ramon 19-10-2021
 * 
 * Java's BitSet class implements a vector of bit values (i.e.: false(0) or true(1)) that grows as needed, allowing
 * us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a set bit.
 * Given 2 BitSets, B_1 and B_2, of size N where all bits in both BitSets are initialized to 0, perform aseries of M operations.
 * After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
 * 
 * INPUT FORMAT:
 * The first line contains 2 space-separated integers, N (the length of both BitSets B_1 and B_2) and M
 * (the number of operations to perform), respectively. The M subsequent lines each contain an operation
 * in one of the following forms:
 *      - AND <set> <set>
 *      - OR <set> <set>
 *      - XOR <set> <set>
 *      - FLIP <set> <index>
 *      - SET <set> <index>
 * 
 * OUTPUT FORMAT:
 * After each operation, print the respective number of set bits in BitSet B_1 and BitSet B_2 as 2 space-separated integers on a new line.
 * */

import java.util.*;

public class JavaBitSet {
    // Names of the operations are defined as constants
    private final static String AND = "AND";
    private final static String OR = "OR";
    private final static String XOR = "XOR";
    private final static String FLIP = "FLIP";
    private final static String SET = "SET";
    private final static int numSets = 2;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lengthBitSets = scan.nextInt();
        int numOperations = scan.nextInt();
        

        ArrayList<BitSet> sets = new ArrayList<>();

        // Initializing each set with the specified size
        for (int i = 0; i < numSets; i++) {
            sets.add(new BitSet(lengthBitSets));
        }


        for (int i = 0; i < numOperations; i++) {
            String operation = scan.next();
            int leftOperand = scan.nextInt();
            int rightOperand = scan.nextInt();
            if (operation.compareTo(AND) == 0) {
                sets.get(leftOperand - 1).and(sets.get(rightOperand - 1));
            } else if (operation.compareTo(OR) == 0) {
                sets.get(leftOperand - 1).or(sets.get(rightOperand - 1));
            } else if (operation.compareTo(XOR) == 0) {
                sets.get(leftOperand - 1).xor(sets.get(rightOperand - 1));
            } else if (operation.compareTo(FLIP) == 0) {
                sets.get(leftOperand - 1).flip(rightOperand);
            } else if (operation.compareTo(SET) == 0) {
                sets.get(leftOperand - 1).set(rightOperand);
            }

            // Every time an operation is performed, we have to print the number of bits set to true
            System.out.println(sets.get(0).cardinality() + " " + sets.get(1).cardinality());
        }

        scan.close();
    }
}
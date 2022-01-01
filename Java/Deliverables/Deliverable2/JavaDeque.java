import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<Integer>();
        // We will use a set since we do not want repeated elements.
        Set<Integer> uniqueElements = new HashSet<Integer>();

        
        int numElements = scan.nextInt();
        int sizeSubArray = scan.nextInt();
        int maxUnique = 0;

    
        for (int i = 1; i < numElements + 1; i++) {
            int currentNumber = scan.nextInt();
            deque.add(currentNumber);
            uniqueElements.add(currentNumber);
            if (deque.size() == sizeSubArray) {
                if (uniqueElements.size() > maxUnique) {
                    maxUnique = uniqueElements.size();
                    
                }
                int first = deque.removeFirst();
                // If the element that we want to remove is still in the queue, this means that we do not want to remove it
                // because we still may want to count it as a unique element for the next subarray, even if in this subarray
                // it was a repeated element
                if (uniqueElements.contains(first) && deque.contains(first) == false) {
                    uniqueElements.remove(first);
                }
            }            
        }

        System.out.println(maxUnique);

        scan.close();
    }
}
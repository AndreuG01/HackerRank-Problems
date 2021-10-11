import java.util.Scanner;

/**
 * Given an integer, n, perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 * 
 * INPUT FORMAT: a single line containing a positive integer n
 * CONSTRAINTS: 1 <= n <= 100
 */



public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        scan.close();

        if (1 <= number && number <= 100) {
            if (number % 2 != 0) {
            System.out.println("Weird");
            } else {
                if (2 <= number && number <= 5) {
                    System.out.println("Not Weird");
                } else if (6 <= number && number <= 20) {
                    System.out.println("Weird");
                } else if (number > 20) {
                    System.out.println("Not Weird");
                }
            }
        }
        
    }

    
}

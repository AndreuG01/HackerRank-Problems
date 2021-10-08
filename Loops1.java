import java.util.Scanner;


/**
 * In this challenge, we are going to use loops to help us do some simple math.
 * Given an integer N, print its first 1' multiples. Each multiplee N * i hsould be printed
 * on a new line in the form: N x i = result
 * 
 * INPUT FORMAT: a single integer N
 */

public class Loops1 {
    public static void main(String[] args) {
        // In this program, we are going to use a different object to read from stdin
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        int maxMultiples = 10;
        for (int i = 0; i < maxMultiples; i++) {
            System.out.println(number + " x " + (i + 1) + " = " + number * (i + 1));
        }
    }
}

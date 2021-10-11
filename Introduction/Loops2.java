import java.util.Scanner;

/**
 * We use the integers a, b and n to create the followinf series:
 * (a + 2^0 * b), (a + 2^0 * b + 2^1 * b), ... , (a + 2^0 * b + 2^1 * b + ... + 2^(n-1) * b)
 * 
 * INPUT FORMAT: the first line contains an integer q denoting the number of queries.
 * Each line i of the q subsequent lines contains three space-separated integers describing the respective
 * a_i, b_i and n_i values for that query.
 */

public class Loops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numQueries = scan.nextInt();

        for (int i = 0; i < numQueries; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int j = 1; j <= n; j++) {
                int tmp = 0;
                int result = 0;
                for (int k = 0; k < j; k++) {
                    tmp += Math.pow(2, k) * b;
                }
                result = a + tmp;
                System.out.print(result + " ");
            }
            System.out.println("");
        }

        scan.close();

    }
}

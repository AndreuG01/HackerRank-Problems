/**
 * Andreu Garcies Ramon 09-10-2021
 * 
 * You are standing at index 0 of an n-element array named game. From some index i, you can perform one of the following moves.
 *  - Move backwards: if cell i - 1 exists and contains a 0, you can walk back to cell i - 1.
 *  - Move forward:
 *      · If cell i + 1 contains a zero, you can walk to cell i + 1.
 *      · If cell i + leap contains a zero, you can jump to cell i + leap.
 *      · If you're standing in cell n - 1 or the value of i + leap >= n, you can walk or jump off the end of the array and win the game.
 * 
 * INPUT FORMAT: The first line contains an integer q denoting the number of queries.
 * The 2 * q subsequent lines describe each query over two lines:
 *  1. The first line contains two space-separated integers describing the respective values of n and leap.
 *  2. The second line contains n space-separated binary integers describing the respective values of the array game[].
 * 
 */


import java.util.Scanner;

public class Java1DArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numQueries = scan.nextInt();

        for (int i = 0; i < numQueries * 2; i += 2) {
            int arraySize = scan.nextInt();
            int[] array = new int[arraySize];
            int leap = scan.nextInt();

            for (int j = 0; j < arraySize; j++) { // Filling the array
                array[j] = scan.nextInt();
            }


            // At this point, the array is already filled and we just have to see if the user can win the game
            if (Java1DArray2.canWin(leap, 0, array) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scan.close();


    }

    public static boolean canWin(int leap, int position, int game[]) {
        if (position <  0) {
            return false;
        } else {
            if (position >= game.length) {
                return true;
            } else if (game[position] != 0) {
                return false;
            } else {
                game[position] = 1; // Different than 0 to indicate that we have already checked this position
                return canWin(leap, position - 1, game) || canWin(leap, position + 1, game) || canWin(leap, position + leap, game);
            }
        } 
    }
}
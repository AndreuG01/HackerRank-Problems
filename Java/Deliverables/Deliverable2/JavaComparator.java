/**
 * Andreu Garcies Ramon 12-10-2021
 * 
 * Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.
 * The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.
 * Given an array of n Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more
 * players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class
 * that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
 * 
 * INPUT FORMAT:
 * The first line contains an integer, n, denoting the number of players.
 * Each of the n subsequent lines contains a player's name and score, respectively.
 * 
 * OUTPUT FORMAT: Print the sorted array.
 * 
 * */

import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
        // The compare documentation states that: "Compares its two arguments for order.
        // Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second."
        if (firstPlayer.getScore() == secondPlayer.getScore()) {
            return firstPlayer.getName().compareTo(secondPlayer.getName());
        } else {
            // Now we have to return what the function compare is expected to return.
            if (firstPlayer.getScore() > secondPlayer.getScore()) {
                return -1;
            } else if (firstPlayer.getScore() < secondPlayer.getScore()) {
                return 1;
            } else {
                return 0;
            }
            // We could simplify it as well and return secondPlayer.score - firstPlayer.score
        }
    }
}

class Player {
    private String name;
    private int score;

    // constructor method
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // other methods
    public void printPlayer() {
        System.out.println(name + " " + score);
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numElements = scan.nextInt();

        Player[] playerArray = new Player[numElements];
        Checker checker = new Checker();

        for (int i = 0; i < numElements; i++) {
            playerArray[i] = new Player(scan.next(), scan.nextInt());
        }

        Arrays.sort(playerArray, checker);
        
        for (Player player: playerArray) {
            player.printPlayer();
        }

        scan.close();
    }
}

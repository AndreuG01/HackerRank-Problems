/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 * It's time to test your knowledge of Static initialization blocks. You can read about it here.
 * You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram
 * with breadth B and height H. You should read the variables from the standard input.
 * If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 * 
 * INPUT FORMAT: There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
 * 
 * OUTPUT FORMAT: If both values are greater than zero, then the main method must output the area of the parallelogram.
 * Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
 * */

import java.util.Scanner;

public class StaticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    static int breath;
    static int height;
    static boolean flag;

    static {
        breath = scan.nextInt();
        height = scan.nextInt();
        flag = breath > 0 && height > 0;
        
    }
    public static void main(String[] args) {
        
        if (flag == true) {
            System.out.println(breath * height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scan.close();
    }
}

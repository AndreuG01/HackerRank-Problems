/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * The Calendar class is an abstract class that provides methods for converting between a specific
 * instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,
 * and for manipulating the calendar fields, such as getting the date of the next week.
 * 
 * You are given a date and you need to print the day of the week in capital letters corresponding to that date.
 * 
 * INPUT FORMAT: A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.* 
 */

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            int month = scan.nextInt();
            int day = scan.nextInt();
            int year = scan.nextInt();

            LocalDate date = LocalDate.of(year, month, day);
            System.out.println(date.getDayOfWeek());

        } catch (Exception e) {
            System.out.println("Error when reading from STDIN");
        }

        scan.close();
    }
}

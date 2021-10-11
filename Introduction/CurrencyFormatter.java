/**
 * Andreu Garcies Ramon 11-10-2021
 * 
 * Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class'
 * getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
 * 
 * Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
 * 
 * INPUT FORMAT: A single double-precision number denoting payment.
 * 
 * OUTPUT FORMAT:
 * 1. On the first line, print US: u where u is payment formatted for US currency.
 * 2. On the second line, print India: i where i is payment formatted for Indian currency.
 * 3. On the third line, print China: c where c is payment formatted for Chinese currency.
 * 4. On the fourth line, print France: f, where f is payment formatted for French currency.
 *  */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = scan.nextDouble();

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(money));

        // There are no predefiend field details for INDIA. Therefore, we have to create it.
        Locale indiaLocale = new Locale("hi", "IN"); // We are said that the language is English. The country code
        // has been found from oracle.com/java/technologies/javase/jdk15-suported-locales.html
        // NOTE: this code will not work in hacker rank with java 15, since the solution is based on the output format of Java 8 or Java 7

        System.out.println("India: " + NumberFormat.getCurrencyInstance(indiaLocale).format(money));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(money));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money));
        
        scan.close();
    }
}

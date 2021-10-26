/**
 * Andreu Garcies Ramon 20-10-2021
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

class InstanceOfStudent {}
class Rockstar {}
class Hacker {}

public class InstanceOf {
    static String instanceOfStudentClass = "InstanceOfStudent";
    static String studentClass = "Student";
    static String rockstarClass = "Rockstar";
    static String hackerClass = "Hacker";
    static String count(ArrayList<Object> list) {
        int studentCounter = 0, rockstarCounter = 0, hackerCounter = 0;
        for (Object element: list) {
            String elementClassName = element.getClass().getName();
            if (instanceOfStudentClass.compareTo(elementClassName) == 0) {
                studentCounter += 1;
            } else if (rockstarClass.compareTo(elementClassName) == 0) {
                rockstarCounter += 1;
            } else if (hackerClass.compareTo(elementClassName) == 0) {
                hackerCounter += 1;
            }

        }
        String returnString = String.format("%s %s %s", studentCounter, rockstarCounter, hackerCounter);
        return returnString;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<Object>();

        int numQueries = scan.nextInt();

        for (int i = 0; i < numQueries; i++) {
            String inputClass = scan.next();
            if (inputClass.equals(studentClass))  {
                list.add(new InstanceOfStudent());
            } else if (inputClass.equals(rockstarClass)) {
                list.add(new Rockstar());
            } else if (inputClass.equals(hackerClass)) {
                list.add(new Hacker());
            }
        }

        System.out.println(count(list));

        scan.close();
    }
}

/**
 * Andreu Garcies Ramon 12-10-2021
 * 
 * You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange
 * them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange
 * them according to their first name in alphabetical order. If those two students also have the same
 * first name, then order them according to their ID. No two students have the same ID.
 * 
 * INPUT FORMAT: 
 * The first line of input contains an integer N, representing the total number of students.
 * The next N lines contains a list of student information in the following structure: ID Name CGPA
 *
 * OUTPUT FORMAT:
 * After rearranging the students according to the above rules, print the first name of each student on a separate line.
 * 
 */

import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    // Constructor method
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    // other methods
    public void printStudentName() {
        System.out.println(name);
    }
}

class SortChecker implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        // With doubles we should not use the == comparator
        int cgpaCompare = Double.compare(firstStudent.getCgpa(), secondStudent.getCgpa());
        if (cgpaCompare == 0) {
            int nameCompare = firstStudent.getName().compareTo(secondStudent.getName());
            if (nameCompare == 0) {
                return firstStudent.getId() - secondStudent.getId();
            } else {
                return nameCompare;
            }
        } else {
            // Double.compare(num1, num2) returns
            // NEGATIVE if num1 is less than num2
            // POSITIVE if num1 is greater than num2
            // 0 otherwise.
            // Since we want to sort the cgpa in decreasing order, we need to return the opposite.
            // This could be done as well comparing the second with the first instead of comparing the first with the second. 
            return (-1) * cgpaCompare;
        }
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberElements = scan.nextInt();

        Student[] studentArray = new Student[numberElements];
        SortChecker checker = new SortChecker();

        for (int i = 0; i < numberElements; i++) {
            studentArray[i] = new Student(scan.nextInt(), scan.next(), scan.nextDouble());
        }

        Arrays.sort(studentArray, checker);

        for (Student student: studentArray) {
            student.printStudentName();
        }
        scan.close();
    }
}

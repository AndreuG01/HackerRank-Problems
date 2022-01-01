/**
 * Andreu Garcies Ramon 14-11-2021
 * 
 * In this problem we will test your knowledge on Java Priority Queue.
 * There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED, can take place which are described below.
 *         - ENTER: A student with some priority enters the queue to be served.
 *         - SERVED: The student with the highest priority is served (removed) from the queue.
 * 
 * A unique id is assigned to each student entering the queue. The queue serves the students based on the following criteria (priority criteria):
 * 1- The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * 2- Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
 * 3- Any students having the same CGPA and name will be served in ascending order of the id.
 * 
 * INPUT FORMAT:
 * The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines will be of the following two forms:
 * 1- ENTER name CGPA id: The student to be inserted into the priority queue.
 * 2- SERVED: The highest priority student in the queue was served.
 * 
 * OUTPUT FORMAT:
 * The locked stub code prints the names of the students yet to be served in the priority order. If there are no such student, then the code prints EMPTY.
 * */

import java.util.*;


class StudentPriorityQueue {
    private int id;
    private String name;
    private double cgpa;

    public StudentPriorityQueue(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public double getCGPA() { return cgpa; }
}

class ComparatorPriorityQueue implements Comparator<StudentPriorityQueue> {
    @Override
    public int compare(StudentPriorityQueue firstStudent, StudentPriorityQueue secondStudent) {
        // With doubles we should not use the == comparator
        int cgpaCompare = Double.compare(firstStudent.getCGPA(), secondStudent.getCGPA());
        if (cgpaCompare == 0) {
            int nameCompare = firstStudent.getName().compareTo(secondStudent.getName());
            if (nameCompare == 0) {
                return firstStudent.getID() - secondStudent.getID();
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

class Priorities {
    
    public List<StudentPriorityQueue> getStudents(List<StudentPriorityQueue> studentList) {
        if (studentList.size() != 0) { // If the list is empty, we can not do anything
            Collections.sort(studentList, new ComparatorPriorityQueue());
            studentList.remove(0); // After having sorted the elements in the preference that it corresponds, we have to remove the first one.
        }
        return studentList;
    }    
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    public static void main(String[] args) {
        int numEvents = scan.nextInt();
        String action;
        List<StudentPriorityQueue> studentList = new ArrayList<StudentPriorityQueue>();

        for (int i = 0; i < numEvents; i++) {
            action = scan.next();
            if (action.compareTo("ENTER") == 0) {
                // Introduce the student to the list
                String name = scan.next();
                double cgpa = scan.nextDouble();
                int id = scan.nextInt();
                StudentPriorityQueue currentStudent = new StudentPriorityQueue(id, name, cgpa);
                studentList.add(currentStudent);

            } else if (action.compareTo("SERVED") == 0) {
                studentList = priorities.getStudents(studentList);
            }
        }

        // Printing the remaining students in the queue
        if (studentList.size() == 0) {
            // If there are no elements, we have to print EMPTY
            System.out.println("EMPTY");
        } else {
            for (StudentPriorityQueue student : studentList) {
                System.out.println(student.getName());
            }
        }
    }
}

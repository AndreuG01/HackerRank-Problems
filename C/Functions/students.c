/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * You are given an array of integers, marks, denoting the marks scored by students in a class.
 * The alternating elements marks_0, marks_2, marks_4 and so on denote the marks of boys.
 * Similarly, marks_1, marks_3, marks_5 and so on denote the marks of girls.
 * 
 * INPUT FORMAT:
 * The first line contains number_of_students, denoting the number of students in the class, hence the number of elements in marks.
 * Each of the number_of_students subsequent lines contains marks_i.
 * The next line contains gender.

*/

#include <stdio.h>
#include <stdlib.h>

int marks_summation(int *marks, int number_of_students, char gender) {
    // Determining the start index
    int start_idx = 0;
    if (gender == 'g') {
        start_idx = 1;
    }

    // Adding the corresponding marks
    int addition = 0;
    for (int i = start_idx; i < number_of_students; i += 2) {
        addition += marks[i];
    }

    return addition;
}

int main() {
    int number_of_students;
    char gender;
    int sum;
  
    scanf("%d", &number_of_students);
    int *marks = malloc(number_of_students * sizeof(int));
 
    for (int i = 0; i < number_of_students; i++) {
        scanf("%d", &marks[i]);
    }
    
    
    scanf(" %c", &gender);
    sum = marks_summation(marks, number_of_students, gender);
    printf("%d\n", sum);
    free(marks);
 
    return 0;
}
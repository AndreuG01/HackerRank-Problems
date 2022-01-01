/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * Complete the function void update(int *a,int *b). It receives two integer pointers, int* a and int* b. Set the value of a to their sum, and b to their absolute difference.
 * There is no return value, and no return statement is needed.
 *      - a' = a + b
 *      - b' = |a - b|
 * 
 * INPUT FORMAT: The input will contain two integers, a and b, separated by a new line
 * OUTPUT FORMAT: Modify the two values in place and the code stub main() will print their values. 
*/

#include <stdio.h>

int absolute_value(int number) {
    if (number >= 1) {
        return number;
    } else {
        return number * -1;
    }
}

void update(int *a, int *b) {
    int addition = *a + *b;
    int difference = absolute_value(*a - *b);
    *a = addition;
    *b = difference;
}

int main() {
    int a = 0, b = 0;
    int *a_pointer = &a, *b_pointer = &b;
    
    scanf("%d %d", &a, &b);
    update(a_pointer, b_pointer);
    printf("%d\n%d\n", a, b);
    return 0;
}
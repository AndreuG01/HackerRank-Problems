/**
 * Andreu Garcies Ramon 04-01-2022
 * 
 * Print a pattern of numbers from 1 to n as shown below. Each of the numbers is separated by a single space. 
 *  4 4 4 4 4 4 4  
 *  4 3 3 3 3 3 4   
 *  4 3 2 2 2 3 4   
 *  4 3 2 1 2 3 4   
 *  4 3 2 2 2 3 4   
 *  4 3 3 3 3 3 4   
 *  4 4 4 4 4 4 4   
*/

#include <stdio.h>

int find_minimum(int a, int b) {
    if (a < b) {
        return a;
    }
    return b;
}

void print_pattern(int number) {
    int length = 2 * number - 1;
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            int min = find_minimum(i, j);
            min = find_minimum(min, length - i - 1);
            min = find_minimum(min, length - j - 1);
            if (j == length - 1) {
                printf("%d", number - min);
            } else {
                printf("%d ", number - min);
            }
        }
        printf("\n");
    }
}

int main() {
    int input_number = 0;
    scanf("%d", &input_number);
    print_pattern(input_number);
    return 0;
}
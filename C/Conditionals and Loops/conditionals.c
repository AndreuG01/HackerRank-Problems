/**
 * Andreu Garcies Ramon 04-01-2022
 * 
 * Given a positive integer denoting n, do the following:
 *      - If 1 <= n <= 9, print the lowercase English word corresponding to the number (e.g., one for 1, two for 2, etc.).
 *      - If n > 9, print Greater than 9
 * 
 * INPUT FORMAT: The first line contains a single integer, n.
*/

#include <stdio.h>

#define ONE "one"
#define TWO "two"
#define THREE "three"
#define FOUR "four"
#define FIVE "five"
#define SIX "six"
#define SEVEN "seven"
#define EIGHT "eight"
#define NINE "nine"
#define GREAT_NINE "Greater than 9"

int main() {
    int input_number = 0;
    scanf("%d", &input_number);

    if (input_number == 1) {
        printf("%s\n", ONE);
    } else if (input_number == 2) {
        printf("%s\n", TWO);
    } else if (input_number == 3) {
        printf("%s\n", THREE);
    } else if (input_number == 4) {
        printf("%s\n", FOUR);
    } else if (input_number == 5) {
        printf("%s\n", FIVE);
    } else if (input_number == 6) {
        printf("%s\n", SIX);
    } else if (input_number == 7) {
        printf("%s\n", SEVEN);
    } else if (input_number == 8) {
        printf("%s\n", EIGHT);
    } else if (input_number == 9) {
        printf("%s\n", NINE);
    } else {
        printf("%s\n", GREAT_NINE);
    }
    return 0;
}
/**
 * Andreu Garcies Ramon 04-01-2022
 * 
 * For each integer n in the interval [a, b] (given as input):
 *      - If 1 <= n <= 9, then print the English representation of it in lowercase. That is "one" for , 1 "two" for 2, and so on.
 *      - Else if n > 9 and it is an even number, then print "even".
 *      - Else if n > 9 and it is an odd number, then print "odd".
 * 
 * INPUT FORMAT: The first line contains an integer, a. The seond line contains an integer, b.
 * 
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

void print_number(int number) {
    if (number == 1) {
        printf("%s\n", ONE);
    } else if (number == 2) {
        printf("%s\n", TWO);
    } else if (number == 3) {
        printf("%s\n", THREE);
    } else if (number == 4) {
        printf("%s\n", FOUR);
    } else if (number == 5) {
        printf("%s\n", FIVE);
    } else if (number == 6) {
        printf("%s\n", SIX);
    } else if (number == 7) {
        printf("%s\n", SEVEN);
    } else if (number == 8) {
        printf("%s\n", EIGHT);
    } else if (number == 9) {
        printf("%s\n", NINE);
    }
}

void print_even_odd(int number) {
    if (number % 2 == 0) {
        printf("even\n");
    } else {
        printf("odd\n");
    }
}

int main() {
    int num1 = 0, num2 = 0;
    scanf("%d\n%d", &num1, &num2);

    for (int i = num1; i <= num2; i++) {
        if (i <= 9) {
            print_number(i);
        } else {
            print_even_odd(i);
        }
    }

    return 0;
}
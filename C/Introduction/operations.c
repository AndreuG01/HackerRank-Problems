/**
 * Andreu Garcies Ramon 01-01-2022
 * Your task is to take two numbers of int data type, two numbers of float data type as input and output their sum:
 *  1. Declare 4 variables: two of type int and two of type float.
 *  2. Read 2 lines of input from stdin (according to the sequence given in the 'Input Format' section below) and initialize your  variables.
 *  3. Use the + and - operator to perform the following operations:
 *      - Print the sum and difference of two int variable on a new line.
 *      - Print the sum and difference of two float variable rounded to one decimal place on a new line.
 * 
 * INPUT FORMAT:
 * The first line contains two integers.
 * The second line contains two floating point numbers.
 * 
 * OUTPUT FORMAT:
 * Print the sum and difference of both integers separated by a space on the first line, and the sum and difference of both float (scaled to  decimal place) separated by a space on the second line.
*/

#include <stdio.h>

int main() {
    int int1 = 0, int2 = 0;
    float float1 = 0, float2 = 0;

    scanf("%d %d", &int1, &int2);
    scanf("%f %f", &float1, &float2);

    printf("%d %d\n", int1 + int2, int1 - int2);
    printf("%.1f %.1f\n", float1 + float2, float1 - float2);

    return 0;
}
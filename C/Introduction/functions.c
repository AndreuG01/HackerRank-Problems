/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * Write a function int max_of_four(int a, int b, int c, int d) which reads four arguments and returns the greatest of them.
 * 
 * INPUT FORMAT: Input will contain four integers - a, b, c, d , one on each line.
 * OUTPUT FORMAT: Print the greatest of the four integers. Note: I/O will be automatically handled.
*/

#include <stdio.h>

int max(int num1, int num2) {
    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}

int max_of_four(int num1, int num2, int num3, int num4) {
    int max1 = max(num1, num2);
    int max2 = max(num3, num4);
    return max(max1, max2);
}

int main() {
    int num1, num2, num3, num4;
    
    scanf("%d %d %d %d", &num1, &num2, &num3, &num4);
    int ans = max_of_four(num1, num2, num3, num4);
    printf("%d\n", ans);
    
    return 0;
}
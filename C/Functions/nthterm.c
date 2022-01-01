/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * There is a series, S, where the next term is the sum of pervious three terms. Given the first three terms of the series, a, b, and c respectively, you have to output the nth term of the series using recursion.
 * 
 * INPUT FORMAT:
 * The first line contains a single integer, n.
 * The next line contains 3 space-separated integers, a, b, and c.
 * 
 * OUTPUT FORMAT: Print the nth term of the series, S(n)
*/

#include <stdio.h>

// This algorithm could be implemented recursively. The problem is that we would be caluclating the same values many times.
int find_nth_term(int term, int a, int b, int c) {
    int series[term]; // Array where the series will be stored
    // Initializing the array with the three elements that we already know
    series[0] = a;
    series[1] = b;
    series[2] = c;
    

    for (int i = 3; i < term; i++) {
        // Computing each elements of the serie
        series[i] = series[i - 1] + series[i - 2] + series[i - 3];
    }

    return series[term - 1];
}

int find_nth_term_rec(int term, int a, int b, int c) {
    if (term == 1) {
        return a;
    } else if (term == 2) {
        return b;
    } else if (term == 3) {
        return c;
    } else {
        return find_nth_term(term - 1, a, b, c) + find_nth_term(term - 2, a, b, c) + find_nth_term(term - 3, a, b, c);
    }
}

int main() {
    int term_to_find, num1, num2, num3;
  
    scanf("%d %d %d %d", &term_to_find, &num1, &num2, &num3);
    int result = find_nth_term(term_to_find, num1, num2, num3);
 
    printf("%d\n", result);
    return 0;
}
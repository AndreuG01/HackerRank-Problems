/**
 * Andreu Garices Ramon 04-01-2022
 * 
 * In this challenge, you will use logical bitwise operators. All data is stored in its binary representation.
 * The logical operators, and C language, use 1 to represent true and to 0 represent false. The logical operators
 * compare bits in two numbers and return true or false, or, for each bit compared.
 * -> Bitwise AND operator & The output of bitwise AND is 1 if the corresponding bits of two operands is 1. If either bit of an operand is 0, the result of corresponding bit is evaluated to 0. It is denoted by &.
 * -> Bitwise OR operator | The output of bitwise OR is 1 if at least one corresponding bit of two operands is 1. It is denoted by |.
 * -> Bitwise XOR (exclusive OR) operator ^ The result of bitwise XOR operator is 1 if the corresponding bits of two operands are opposite.
 * 
 * INPUT FORMAT: The only line contains 2 space-separated integers, n and k.
*/

#include <stdio.h>
#include <stdlib.h>

void fill_arrays(int length, const int *array, int *and, int *or, int *xor) {
    int pair_counter = 0;
    for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
            and[pair_counter] = array[i] & array[j];
            or[pair_counter] = array[i] | array[j];
            xor[pair_counter] = array[i] ^ array[j];
            pair_counter += 1;
        }
    }
}

int get_max_less_than(int length, const int *array, int less_than) {
    int max = 0;
    for (int i = 0; i < length; i++) {
        if (array[i] > max && array[i] < less_than) {
            max = array[i];
        }
    }
    return max;
}

int get_corresponding_number(int max, int k) {
    if (max < k) {
        return max;
    } else {
        return 0;
    }
}

int main() {
    int n, k;
    scanf("%d %d", &n, &k);

    int *array = calloc(n, sizeof(int));
    for (int i = 0; i < n; i++) {
        array[i] = i + 1;
    }

    int total_operations = ((n-1) * n) / 2;
    int *and_array = calloc(total_operations, sizeof(int));
    int *or_array = calloc(total_operations, sizeof(int));
    int *xor_array = calloc(total_operations, sizeof(int));
    fill_arrays(n, array, and_array, or_array, xor_array);

    printf("%d\n", get_corresponding_number(get_max_less_than(total_operations, and_array, k), k));
    printf("%d\n", get_corresponding_number(get_max_less_than(total_operations, or_array, k), k));
    printf("%d\n", get_corresponding_number(get_max_less_than(total_operations, xor_array, k), k));

    return 0;
}
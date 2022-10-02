#include <stdio.h>

int sum_digits(int number) {
    int addition = 0;
    int decreasing_num = number;
    while (decreasing_num) {
        addition += decreasing_num % 10;
        decreasing_num = decreasing_num / 10;
    }
    return addition;
}

int main() {
    int input_number = 0;
    scanf("%d", &input_number);

    printf("%d\n", sum_digits(input_number));
    return 0;
}
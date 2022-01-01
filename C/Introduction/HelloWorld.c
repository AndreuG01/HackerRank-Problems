/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * This challenge requires you to print Hello, World! on a single line, and then print the already provided input string
 * to stdout. If you are not familiar with C, you may want to read about the printf() command.
 * 
 * INPUT FORMAT: There is one line of text, s.
*/

#include <stdio.h>
#include <stdlib.h>

#define HELLO_WORLD "Hello, World!"

int main() {

    char input_string[100];
    scanf("%[^\n]%*c", &input_string);

    printf("%s\n", HELLO_WORLD);
    printf("%s\n", input_string);

    return 0;
}
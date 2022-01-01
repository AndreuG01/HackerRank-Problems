/**
 * Andreu Garcies Ramon 01-01-2022
 * 
 * This challenge will help you to learn how to take a character, a string and a sentence as input in C.
 * 
 * INPUT FORMAT:
 * 1 - First, take a character,  as input. 
 * 2 - Then take the string,  as input. 
 * 3 - Lastly, take the sentence  as input.
 * 
 * OUTPUT FORMAT:
 * Print three lines of output.
 * 1 - The first line prints the character, ch.
 * 2 - The second line prints the string, s. 
 * 3 - The third line prints the sentence, sen.
*/

#include <stdio.h>

int main() {
    char character;
    char string[100];
    char sentence[100];

    scanf("%c", &character);
    printf("%c\n", character);

    scanf("%s", string);
    printf("%s\n", string);

    scanf("\n");
    scanf("%[^\n]%*c", sentence); // Scanning the whole sentence
    printf("%s\n", sentence);
    return 0;
}
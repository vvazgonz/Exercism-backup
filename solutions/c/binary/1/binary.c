#include "binary.h"
#include "math.h"
#include "string.h"

int convert(const char *input) {
    int decimal = 0;
    for (int i = strlen(input)-1; i >= 0; i--) {
        if (input[i] == '0' || input[i] == '1')
            decimal += ((int)input[i] -48) * pow(2, strlen(input) - i -1);
        else return INVALID;
    }
    return decimal;
}
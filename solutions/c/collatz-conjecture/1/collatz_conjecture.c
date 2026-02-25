#include "collatz_conjecture.h"

int steps(int start) {
    int num = 0;
    if (start < 1)
        return -1;
    while (start > 1) {
        num++;
        if (start % 2) { // Si es impar
            start = 3 * start +1;
        } else {
            start /= 2;
        }
    }
    return num;
}
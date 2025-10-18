#include "grains.h"
#include <math.h>

uint64_t square(uint8_t n) {
    return pow(2, n - 1);    
}

uint64_t total() {
    int total = 0;
    for (int i = 1; i < 65; i ++) {
        total += square(i);
    }
    return total;
}
#include "difference_of_squares.h"

unsigned int sum_of_squares(unsigned int n) {
    int s1 = 0;
    for (unsigned int i = 0; i <= n; i++) {
        s1 += i*i;
    }
    return s1;
}

unsigned int square_of_sum(unsigned int m) {
    int s2 = 0;
    for (unsigned int i = 0; i <= m; i ++) {
        s2 += i;
    }
    return s2 * s2;
}

unsigned int difference_of_squares(unsigned int a) {
    return square_of_sum(a) - sum_of_squares(a);
}
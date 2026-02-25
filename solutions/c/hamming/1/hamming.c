#include "hamming.h"
#include "string.h"

int compute(const char *lhs, const char *rhs) {
    int sum = 0;
    if (strlen(lhs) != strlen(rhs))
       return -1;

    for (long unsigned i=0; i < strlen(lhs); i++) {
        if (lhs[i] != rhs[i])
            sum++;
    }
    return sum;
}

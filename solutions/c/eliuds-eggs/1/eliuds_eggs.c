#include "eliuds_eggs.h"


int egg_count(int num) {
    int sum = 0;
    int flag = 0;
    while (flag == 0) {
        sum += num%2;
        num /= 2;
        if (num < 1)
            flag = 1;
    }
    return sum;
}
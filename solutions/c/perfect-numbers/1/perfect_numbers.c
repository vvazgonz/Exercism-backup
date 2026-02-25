#include "perfect_numbers.h"

int classify_number(int number) {
    int suma = 0;
    if (number <= 0) {
        return -1;
    }
    for (int i = 1; i < number/2 +1; i++) {
         if ((number % i) == 0) {
             suma+=i;
         }
             
    }
    if (number == suma)
        return 1;
    if (number < suma)
        return 2;
    else return 3;
}
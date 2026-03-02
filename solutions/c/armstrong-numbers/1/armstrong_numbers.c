#include <stdio.h>
#include "armstrong_numbers.h"
#include <math.h>

bool is_armstrong_number(int candidate) {
    if (candidate < 0) return false;
    if (candidate < 10) return true;
    int number = candidate;
    int suma = 0;
    int num_digitos = floor(log10(candidate)) + 1;
    
    while (number >= 10) {
        int digito = number %10;
        suma += pow(digito, num_digitos);
        number /= 10;
    }
    
    return suma == candidate;
}
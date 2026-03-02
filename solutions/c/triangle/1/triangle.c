#include "triangle.h"
#include <math.h>
#include <stdbool.h>

bool validate(triangle_t triangle) {
    double a = triangle.a;
    double b = triangle.b;
    double c = triangle.c;
    return (a+b >= c) && (b+c >= a) && (a + c >= b) && !(a == 0 || b == 0 || c==0);
}

bool is_equilateral(triangle_t triangle) {
    if (!validate(triangle)) return false;
    return (triangle.a == triangle.b) && (triangle.b == triangle.c);
}

bool is_isosceles(triangle_t triangle) {
    if (!validate(triangle)) return false;
    return (triangle.a == triangle.b) || (triangle.b == triangle.c) || (triangle.a == triangle.c);
}
bool is_scalene(triangle_t triangle) {
    if (!validate(triangle)) return false;
    return (triangle.a != triangle.b) && (triangle.b != triangle.c) && (triangle.a != triangle.c);
}


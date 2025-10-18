#include "resistor_color.h"

int color_code(resistor_band_t color) {
    if (color == BLACK)
        return 0;
    else if (color == BROWN)
        return 1;
    else if (color == RED)
        return 2;
    else if (color == ORANGE)
        return 3;
    else if (color == YELLOW)
        return 4;
    else if (color == GREEN)
        return 5;
    else if (color == BLUE)
        return 6;
    else if (color == VIOLET)
        return 7;
    else if (color == GREY)
        return 8;
    else 
        return 9;
    
}
const resistor_band_t COLORS[] = {BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE};
const resistor_band_t* colors(void) {
    return COLORS;
}


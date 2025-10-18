class Darts {
    int score(double x, double y) {
        double R = Math.sqrt(x*x + y*y);
        if (R <= 1) {
            return 10;
        } else if (R > 5 && R <= 10) {
            return 1;
        } else if (R> 1 && R<= 5) {
            return 5;
        } else {
            return 0;
        }
        
    }
}

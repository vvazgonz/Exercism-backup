class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int suma = 0;
        for (int i = 1; i <= input; i++) {
            suma += i;
        }
        return (int) (Math.pow(suma,2));
    }

    int computeSumOfSquaresTo(int input) {
        int suma = 0;
        for (int i = 1; i <= input; i++) {
            suma += (int) (Math.pow(i,2));
        }
        return suma;
    }

    int computeDifferenceOfSquares(int input) {
        return  computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}

class NaturalNumber {
    private int number;
    NaturalNumber(int number) {
        if (number < 1) {throw new IllegalArgumentException("You must supply a natural number (positive integer)");}
        this.number = number;
    }

    Classification getClassification() {
        if (this.number == 1) {return Classification.DEFICIENT;}
        
        int suma = 0;
        for (int i = 1; i <= this.number /2; i++) {
            if (this.number%i == 0) {suma+=i;}
        }
        if (this.number == suma) {return Classification.PERFECT;}
        else if (this.number < suma) {return Classification.ABUNDANT;}
        else {return Classification.DEFICIENT;}
    }
}

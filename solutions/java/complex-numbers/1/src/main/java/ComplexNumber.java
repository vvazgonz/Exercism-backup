class ComplexNumber {

    private double real;
    private double imaginary;
    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    double getReal() {
        return this.real;
    }

    double getImaginary() {
        return this.imaginary;
    }

    double abs() {
        return Math.sqrt(Math.pow(real,2)+Math.pow(imaginary,2));
    }

    ComplexNumber add(ComplexNumber other) {
        double re = this.getReal() + other.getReal();
        double im = this.getImaginary() + other.getImaginary();
        return new ComplexNumber(re,im);
    }

    ComplexNumber subtract(ComplexNumber other) {
        double otherre = other.real;
        double otherim = other.imaginary;
        ComplexNumber lol = new ComplexNumber(-otherre, -otherim);
        ComplexNumber subtract = this.add(lol);
        return subtract;
        }

    ComplexNumber multiply(ComplexNumber other) {
        double re = this.real * other.real - this.imaginary * other.imaginary;
        double im = this.imaginary * other.real + this.real * other.imaginary;
        return new ComplexNumber(re,im);
    }

    ComplexNumber multiply(double factor) {
        double re = factor * this.real;
        double im = factor * this.imaginary;
        return new ComplexNumber(re,im);
    }

    ComplexNumber divide(ComplexNumber other) {
        double re = (this.real * other.real + this.imaginary * other.imaginary) / (Math.pow(other.real,2)+Math.pow(other.imaginary,2));
        double im = (this.imaginary * other.real - this.real * other.imaginary) / (Math.pow(other.real,2)+Math.pow(other.imaginary,2));
        return new ComplexNumber(re,im);
    }

    ComplexNumber divide(double divisor) {
        return new ComplexNumber(this.real / divisor, this.imaginary / divisor);
    }

    ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }

    ComplexNumber exponentialOf() {
        return new ComplexNumber(Math.exp(this.real) * (Math.cos(this.imaginary)), Math.exp(this.real)*Math.sin(this.imaginary));
    }

}
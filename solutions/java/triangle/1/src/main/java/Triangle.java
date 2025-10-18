class Triangle {
    private double a;
    private double b;
    private double c;
    
    Triangle(double a, double b, double c) throws TriangleException {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b >= c && b + c >= a && a + c >= b) {
                this.a = a;
                this.b = b;
                this.c = c;
            } else {
                throw new TriangleException();
            }
        } else {
            throw new TriangleException();
        }
        }

    boolean isEquilateral() {
        return a == b && b == c;
    }

    boolean isIsosceles() {
        return a == b || b == c || c == a;
    }

    boolean isScalene() {
        return a != b && b!=c && c != a;
    }

}

public class SquareRoot {
    public int squareRoot(int radicand) {
        if (radicand<0) {
            return -1;
        }
        double ini = 0;
        double fin = radicand;
        double med = 0;
        while (ini<fin) {
            med = (ini+fin)/2;
            double medpow = med*med;
            if (medpow > radicand) {
                fin = med;
            } else if (medpow < radicand) {
                ini = med;
            } else {
                return (int)med;
            }
        }
        return (int)med;
    }
}

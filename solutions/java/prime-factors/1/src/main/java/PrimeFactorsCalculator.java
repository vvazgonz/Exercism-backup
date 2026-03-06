import java.util.List;
import java.util.ArrayList;

class PrimeFactorsCalculator {

    List<Long> calculatePrimeFactorsOf(long number) {
        List<Long> factors = new ArrayList<>();
        if (number < 2) {return factors;}
        while (number % 2 == 0) {
            factors.add(2L);
            number /= 2;
        }
        for (long i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (number > 1) {
            factors.add(number);
        }

        return factors;
    }

}
import java.util.*;

class SumOfMultiples {
    private int number;
    private int[] arr;
    SumOfMultiples(int number, int[] arr) {
        this.number = number;
        this.arr = arr;
    }

    int getSum() {
        int suma = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer n : arr) {
            if (n == 0) {
                continue;
            }
            for (int i = 1; i * n < number; i++) {
                set.add(i*n);  
            }
        }
        for (Integer n : set) {
            suma += n;
        }
        return suma;
    }

}

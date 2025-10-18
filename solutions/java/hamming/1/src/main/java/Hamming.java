public class Hamming {
    private int hammingCount;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            int count = 0;
            for (int i = 0; i < leftStrand.length(); i++) {
                if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    count++;
                }
            }
            this.hammingCount = count;
        } else {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {
        return this.hammingCount;
    }
}

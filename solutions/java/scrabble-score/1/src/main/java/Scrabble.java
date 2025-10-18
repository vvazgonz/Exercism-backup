class Scrabble {
    private int points;
    Scrabble(String word) {
        int suma = 0;
        for (int i = 0; i<word.length(); i++) {
            switch(word.toUpperCase().charAt(i)) {
                case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N': case 'R': case 'S': case 'T':
                    suma += 1;
                    break;
                case 'D': case 'G':
                    suma += 2;
                    break;
                case 'B': case 'C': case 'M': case 'P':
                    suma += 3;
                    break;
                case 'F': case 'H': case 'V': case 'W': case 'Y':
                    suma += 4;
                    break;
                case 'K':
                    suma += 5;
                    break;
                case 'J': case 'X':
                    suma += 8;
                    break;
                case 'Q': case 'Z':
                    suma += 10;
                    break;
                default:
                    break;
            }
        }
        this.points = suma;
    }

    int getScore() {
        return this.points;
    }

}

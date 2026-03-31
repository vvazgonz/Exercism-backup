import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        Set<Character> letters = getAllLetters();
        Set<Character> input_set = new HashSet<>();
        for (int i = 0; i <input.length(); i++) {
            input_set.add(input.charAt(i));
        }
        for (char l : letters) {
            if (!input_set.contains(l)) {
                return false;
            }
        }
        return true;
    }

    private Set<Character> getAllLetters() {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            letters.add((char) ('a' + i));
        }
        return letters;
    }

}

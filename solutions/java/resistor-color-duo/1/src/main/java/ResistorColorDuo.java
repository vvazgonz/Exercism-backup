import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        String[] color = new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String Color1 = colors[0];
        String Color2 = colors[1];
        return Arrays.asList(color).indexOf(Color1) * 10 + Arrays.asList(color).indexOf(Color2);
        
    }
}

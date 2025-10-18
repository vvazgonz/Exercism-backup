import java.util.Arrays;

class ResistorColorTrio {
    String label(String[] colors) {
        int kilo = 1000;
	    int mega = 1000000;
	    int giga = 1000000000;
	    String[] colorlist = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	    int FirstIndex = Arrays.asList(colorlist).indexOf(colors[0]);
	    int SecondIndex = Arrays.asList(colorlist).indexOf(colors[1]);
	    int ThirdIndex = Arrays.asList(colorlist).indexOf(colors[2]);
	    long ohm = (FirstIndex * 10 + SecondIndex)* (long) Math.pow(10,ThirdIndex);
	    if (ohm >= kilo && ohm < mega) {
	        return ohm / kilo + " kiloohms";
	    } else if (ohm >= mega && ohm < giga) {
	        return ohm / mega + " megaohms";
	    } else if (ohm >= giga) {
            return ohm / giga + " gigaohms";
        } else {
	        return ohm + " ohms";
	    }
	        
        
}
}

public class Lasagna {
    
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int MinutesinOven) {
        return expectedMinutesInOven() - MinutesinOven ;
    }
    
    public int preparationTimeInMinutes(int Layers) {
        int prepa = 2 * Layers;
        return prepa;
    }
    
    public int totalTimeInMinutes(int Layers, int time4layers) {
        int total = preparationTimeInMinutes(Layers) + time4layers;
        return total;
    }
    }

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private int expectedMinutesInOven = 40;
    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    private int MinutesinOven = 30;
    public int remainingMinutesInOven(int MinutesinOven) {
        return expectedMinutesInOven - MinutesinOven ;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    private int Layers = 2;
    private int time4layers = 2;
    public int preparationTimeInMinutes(int Layers) {
        int prepa = Layers * time4layers;
        return prepa;
    }
        
    // TODO: define the 'totalTimeInMinutes()' method
    
    public int totalTimeInMinutes(int Layers, int time4layers) {
        int total = 2 * Layers + time4layers;
        return total;
    }
    }

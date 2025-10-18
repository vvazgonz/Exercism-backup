public class ElonsToyCar {

    private int battery = 100;
    private int meters;
    
    public static ElonsToyCar buy() {

        return new ElonsToyCar();

    }

    public String distanceDisplay() {
        return "Driven " + meters +  " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
        return "Battery empty";    
        }
        
        return "Battery at " + battery + "%";
    }

    public void drive() {

        if (battery>0) {
            battery--;
            meters += 20;
            }
    }
}

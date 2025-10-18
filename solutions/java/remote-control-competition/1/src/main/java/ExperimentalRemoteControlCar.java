public class ExperimentalRemoteControlCar implements RemoteControlCar {

    int dist = 0;
    
    public void drive() {
        dist += 20;
    }

    public int getDistanceTravelled() {
        return dist;
    }
}

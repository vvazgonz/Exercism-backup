
class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    
    int dist = 0;
    int vict = 0;
    
    public void drive() {
        dist += 10;
    }

    public int getDistanceTravelled() {
        return dist;
    }

    public int getNumberOfVictories() {
        return vict;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.vict = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other) {
        return other.getNumberOfVictories() - this.getNumberOfVictories();
    }
}

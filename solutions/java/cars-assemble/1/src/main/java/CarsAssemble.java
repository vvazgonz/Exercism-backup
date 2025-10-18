public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int produccion = speed * 221;
        if (speed<=4) {
            return produccion;
        } else if (speed <=8) {
            return (produccion * 0.9);
        } else if (speed == 9) {
            return (produccion * 0.8);
        } else if (speed == 10) {
            return (produccion * 0.77);
        }
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        int produccion = speed * 221 / 60;
        if (speed<=4) {
            return (int) produccion;
        } else if (speed <=8) {
            return (int) (produccion * 0.9);
        } else if (speed == 9) {
            return (int) (produccion * 0.8);
        } else if (speed == 10) {
            //27,8 transforms to 27, so I rounded to 0.8 (Integer Moment)
            return (int) (produccion * 0.8);
        }
        return 0;
    }
}


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] LastWeek = {0,2,5,3,7,8,4};
        return LastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i<birdsPerDay.length -1; i++) {
            boolean zero = (birdsPerDay[i] == 0) ? true : false;
            return zero;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int add = 0;
        int number = (numberOfDays > birdsPerDay.length) ? (birdsPerDay.length) : (numberOfDays);
        for (int i = 0; i < number; i++) {
            add += birdsPerDay[i];
            
        }
        return add;
    }

    public int getBusyDays() {
        int busy = 0;
        for (int i = 0; i<birdsPerDay.length -1; i++) {
            int adding = (birdsPerDay[i]>=5) ? 1 : 0;
            busy += adding;
            
        }
        return busy; 
    }
}

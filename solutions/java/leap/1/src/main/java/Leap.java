class Leap {

    boolean isLeapYear(int year) {
        boolean leap = ((year%100 == 0) && (year%400 == 0) || ((year%4 == 0) && !(year%100 == 0))) ? true : false;
        return leap;
    }

}

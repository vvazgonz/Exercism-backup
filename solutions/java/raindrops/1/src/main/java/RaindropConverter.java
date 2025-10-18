class RaindropConverter {

    String convert(int n) {
        String r = "";
        if (n%3 == 0) {
            r += "Pling";
        } 
        if (n%5 == 0) {
            r += "Plang";
        } 
        if (n%7 == 0) {
            r += "Plong"; 
        }
        if (n%3 != 0 && n%5 != 0 && n%7 !=0) {
            r = Integer.toString(n);
        }
        return r;
            
    }

}

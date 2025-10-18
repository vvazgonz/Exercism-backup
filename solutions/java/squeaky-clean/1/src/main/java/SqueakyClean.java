class SqueakyClean {
    static String clean(String str) {
        String stri = str;
        if (str.contains(" ")) {
            stri = stri.replace(' ', '_');
        }

        if (stri.contains("-")) {
            String[] parts = stri.split("-");
            stri = parts[0];
            for (int i = 1; i<parts.length; i++) {
                stri += Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1); 
            }
        }
        
        stri = stri.replace("4","a");
        stri = stri.replace("3","e");
        stri = stri.replace("0","o");
        stri = stri.replace("1","l");
        stri = stri.replace("7","t");
        
        
        
        stri = stri.replaceAll("[^a-zA-Z_]","");

        return stri;
    }
}

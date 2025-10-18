import java.lang.String;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        String num = stringToVerify.replaceAll("-","");
        int suma = 0;

        if (num.length() == 10) {
            for ( int i = 0; i < 10; i++) {
                if (num.charAt(i) == 'X' && i == 9) {
                    suma = suma + (10-i) * 10;
                } else if (Character.isDigit(num.charAt(i))) {
                    suma = suma + (10 -i)* Character.getNumericValue(num.charAt(i));
                }
                else {
                    return false;
                    }
                    }
            return (suma%11 == 0);
        } else {
            return false;
            }
    }

}

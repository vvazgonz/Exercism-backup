class ReverseString {

    String reverse(String inputString) {
        String output = "";
        char[] str = inputString.toCharArray();
        for (int i = str.length - 1; i>=0; i--){
            output += str[i];
        }
        return output;
    }
  
}

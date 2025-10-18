class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] num = Integer.toString(numberToCheck).toCharArray();
        int digits = num.length;
        int sum = 0;
        for (int i = 0; i<num.length; i++) {
            sum += Math.pow(Character.getNumericValue(num[i]),num.length);
        }
        return sum == numberToCheck;
        

    }

}

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        String calc = "";
        int result = 0;
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                try {
                    result = operand1 / operand2;   
                } catch (ArithmeticException ae) {
                    throw new IllegalOperationException("Division by zero is not allowed", ae);
                }
                break;
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
        return String.valueOf(operand1) + " " + operation + " " + String.valueOf(operand2) + " = " + String.valueOf(result);
    }
}

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
       if (operation == null) {
        throw new IllegalArgumentException("Operation cannot be null");
       }

       if (operation.isEmpty()) {
        throw new IllegalArgumentException("Operation cannot be empty");
       }
       int result;
       switch (operation) {
         case "+":
           result = operand1 + operand2;
            return (Integer.toString(operand1) + " + " + Integer.toString(operand2) + " = " + result);
         case "-":
            result = operand1 - operand2;
            return (Integer.toString(operand1) + " - " + Integer.toString(operand2)) + " = " + result;
          case "*":
            result = operand1 * operand2;
            return (Integer.toString(operand1) + " * " + Integer.toString(operand2)) + " = " + result;
          case "/":
            if (operand2 == 0) {
                throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
            }
            result = operand1 / operand2;
            return (Integer.toString(operand1) + " / " + Integer.toString(operand2)) + " = " + result;
         default:
           throw new IllegalOperationException("Operation \'" + operation + "\' does not exist");
       }
    }
}

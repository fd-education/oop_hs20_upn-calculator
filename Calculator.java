public class Calculator {
  private double[] operands;
  private String[] validOperations;

  public Calculator() {
    operands = new double[2];
    validOperations = new String[] { "+", "-", "*", ":", "^" };
  }

  public double getResult(String opCode) {
    return mathOp(operands[0], operands[1], opCode);
  }

  public Boolean isValidOp(String opCode) {
    return checkValidOp(opCode);
  }

  public Boolean isZeroDivision(double sOp, String opCode) {
    return checkZeroDivision(sOp, opCode);
  }

  private double mathOp(double fOp, double sOp, String opCode) {
    double result = -0;

    switch (opCode) {
      case "+":
        result = fOp + sOp;
        break;
      case "-":
        result = fOp - sOp;
        break;
      case "*":
        result = fOp * sOp;
        break;
      case "^":
        result = Math.pow(fOp, sOp);
        break;
      case ":":
        result = fOp / sOp;
        break;
    }

    return result;
  }

  private Boolean checkValidOp(String opCode) {
    for (String op : validOperations) {
      if (opCode.contains(op)) {
        return true;
      }
    }
    return false;
  }

  private Boolean checkZeroDivision(double sOp, String opCode) {
    return (opCode.contains(":") && sOp == 0);
  }

}

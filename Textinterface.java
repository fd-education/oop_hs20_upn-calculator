public class Textinterface {
  public String welcome() {
    return ("=================================================================="
        + "\n\n                      UPN - Calculator" + "\n> This calculator only support postfix notation."
        + "\n> That means the operator symbol takes place after the operands.");
  }

  public String explanation() {
    return ("------------------------------------------------------------------"
        + "\n> Please enter your calculations line by line: " + "\n   Operand 1" + "\n   Operand 2"
        + "\n   Operator symbol" + "\n> Of course you can use the result for further calculations."
        + "\n> For that, use the keyword 'result' instead of a numeric value."
        + "\n> Enter a '?' to get this explanation at any point."
        + "\n> You can also enter 'X' at any time to terminate the program." + "\n> Valid operations are: +, -, *, :, ^"
        + "\n------------------------------------------------------------------");
  }

  public String goodbye() {
    return ("------------------------------------------------------------------"
        + "\n> Have a nice day. Calculator out..."
        + "\n==================================================================");
  }

  public String createUnterline(double res) {
    String underline = "";
    for (int i = 0; i < String.valueOf(res).length(); i++) {
      underline += "=";
    }
    return underline;
  }

  public String askForInput(String desiredInput, int index) {
    if (index == 2) {
      return ("> Operator Symbol or Memory Command: ");
    } else {
      return ("> Operand " + index + " or _Memory Command: ");
    }
  }
}
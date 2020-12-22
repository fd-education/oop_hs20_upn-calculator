
public class Reader {

  public Reader() {
  }

  public Boolean isDouble(String input) {
    return checkDouble(input);
  }

  private static Boolean checkDouble(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}

public class Controller {
  private static Textinterface txt = new Textinterface();
  private static Calculator calc = new Calculator();
  private static Boolean terminated = false;

  public static void main(String[] args) {
    System.out.println(txt.welcome() + "\n" + txt.explanation());

    do {

    } while (!terminated);

  }
}

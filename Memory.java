import java.util.Stack;

public class Memory {
  Stack<Double> memory = new Stack<>();

  public Memory() {
  }

  public void memorizeResult(double result) {
    memory.add(result);
  }

  public double getLatestResult() {
    return memory.peek();
  }

  public Stack<Double> switchLatestResults(Stack<Double> stk) {
    double ftmp = stk.pop();
    double stmp = stk.pop();
    stk.push(ftmp);
    stk.push(stmp);
    return stk;
  }

  public Stack<Double> deleteResults(Stack<Double> stk, int q) {
    for (int i = 0; i <= q; i++) {
      stk.pop();
    }

    return stk;
  }

  public Stack<Double> mirrorMemory(Stack<Double> stk) {
    Stack<Double> tmp = new Stack<>();

    while (!stk.isEmpty()) {
      tmp.push(stk.pop());
    }

    return tmp;
  }
}

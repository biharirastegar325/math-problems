public class MathProblems {
  public static int solveMathProblem() {
    int num1 = (int) (Math.random() * 10);
    int num2 = (int) (Math.random() * 10);
    String operation = "+" or "-" or "*";
    switch(operation) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "*":
        return num1 * num2;
      default:
        return 0;
    }
  }
}

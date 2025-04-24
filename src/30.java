import java.util.Scanner;

public class MathProblems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
    }
}

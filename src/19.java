import java.util.*;

public class MathProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2;
        double sum;

        System.out.println("Enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

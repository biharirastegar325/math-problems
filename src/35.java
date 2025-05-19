import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter another number: ");
        int num2 = scanner.nextInt();

        double sum = num1 + num2;
        double difference = Math.abs(num1 - num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The absolute difference between " + num1 + " and " + num2 + " is: " + difference);
    }
}

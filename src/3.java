import java.util.*;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Get the two numbers to be added
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    
    // Add the two numbers and print the result
    int sum = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
  }
}

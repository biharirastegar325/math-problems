import java.util.ArrayList;
import java.util.List;

public class MathProblems {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int sum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + sum);
    }

    private static int calculateSum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return numbers.get(0) + calculateSum(numbers.subList(1, numbers.size()));
        }
    }
}

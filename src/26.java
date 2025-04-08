public class MathProblems {
    // Example problem 1
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 5 is: " + sum);
    }

    // Example problem 2
    public static void main(String[] args) {
        int maxNum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println("The maximum number in the range from 1 to 100 is: " + maxNum);
    }

    // Example problem 3
    public static void main(String[] args) {
        int[][] matrix = {{5, 7}, {3, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example problem 4
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Example problem 5
    public static void main(String[] args) {
        int[][] matrix2 = {{1, 2}, {3, 4}};
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }

}

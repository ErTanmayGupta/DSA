// LeetCode Problem No. 85 Maximal Reactangle
import java.util.*;

class Q85Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows (n) and columns (m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] matrix = new char[n][m];
        System.out.println("Enter the matrix elements (0s and 1s):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        

        int result = maximalRectangle(matrix);

        System.out.println("Maximal Rectangle Area: " + result);

    }

    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            
            Stack<Integer> stack = new Stack<>();

            for (int j = 0; j <= cols; j++) {
                int currHeight = (j == cols) ? 0 : heights[j];

                while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                    int height = heights[stack.pop()];
                    int width = stack.isEmpty() ? j : j - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }

                stack.push(j);
            }
        }

        return maxArea;
    }
}
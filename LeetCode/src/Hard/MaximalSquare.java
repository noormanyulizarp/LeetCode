public class MaximalSquare {
    public static void main(String[] args) {
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        int result = maximalSquare(matrix);
        System.out.println("The area of the largest square is: " + result);
    }

    public static int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int maxSide = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        return maxSide * maxSide; // Return the area of the largest square
    }
}

/*
Explanation:
- The `maximalSquare` method calculates the area of the largest square containing only '1's in a given 2D binary matrix.
- It uses dynamic programming to build a DP table where each cell represents the side length of the largest square that can be formed with the bottom-right corner at that cell.
- The main method initializes a sample matrix and prints the area of the largest square found.
*/
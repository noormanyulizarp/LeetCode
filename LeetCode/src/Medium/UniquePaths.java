public class UniquePaths {
    // Function to calculate the number of unique paths in a grid
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of paths to each cell
        int[][] dp = new int[m][n];

        // Fill the first row and first column with 1s
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // Only one way to reach any cell in the first column
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // Only one way to reach any cell in the first row
        }

        // Fill the rest of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // The number of paths to reach dp[i][j] is the sum of paths from the cell above and the cell to the left
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The bottom-right cell contains the total number of unique paths
        return dp[m - 1][n - 1];
    }

    // Main method to test the uniquePaths function
    public static void main(String[] args) {
        UniquePaths up = new UniquePaths();
        int m = 3; // Number of rows
        int n = 7; // Number of columns
        int result = up.uniquePaths(m, n);
        System.out.println("Number of unique paths from top-left to bottom-right: " + result);
    }
} 

// Example output for m = 3 and n = 7:
// Number of unique paths from top-left to bottom-right: 28
// Explanation: There are 28 unique ways to reach the bottom-right corner of a 3x7 grid.
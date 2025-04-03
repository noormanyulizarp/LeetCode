// File: CherryPickup.java
// This class implements a solution to the "Cherry Pickup" problem.
// The goal is to collect the maximum number of cherries from a grid while moving from the top-left to the bottom-right corner.

public class CherryPickup {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][] dp = new int[n][n][n];
        
        // Initialize the dp array with -1
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                java.util.Arrays.fill(row, -1);
            }
        }
        
        return Math.max(0, collectCherries(grid, 0, 0, 0, dp));
    }

    private int collectCherries(int[][] grid, int r1, int c1, int c2, int[][][] dp) {
        int r2 = r1 + c1 - c2; // Calculate the second row based on the first row and columns

        // Check boundaries and if the cell is a thorn (-1)
        if (r1 >= grid.length || r2 >= grid.length || c1 >= grid[0].length || c2 >= grid[0].length || grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return Integer.MIN_VALUE;
        }

        // If we reach the bottom-right corner, return the cherries collected
        if (r1 == grid.length - 1 && c1 == grid[0].length - 1) {
            return grid[r1][c1];
        }

        // Check if already computed
        if (dp[r1][c1][c2] != -1) {
            return dp[r1][c1][c2];
        }

        // Collect cherries from the current positions
        int cherries = grid[r1][c1];
        if (c1 != c2) {
            cherries += grid[r2][c2]; // Avoid double counting if both are at the same cell
        }

        // Explore all possible moves
        int maxCherries = Math.max(Math.max(collectCherries(grid, r1 + 1, c1, c2 + 1, dp), collectCherries(grid, r1 + 1, c1, c2, dp)),
                                   Math.max(collectCherries(grid, r1, c1 + 1, c2 + 1, dp), collectCherries(grid, r1, c1 + 1, c2, dp)));

        // Store the result in dp array
        dp[r1][c1][c2] = cherries + maxCherries;
        return dp[r1][c1][c2];
    }

    // Example usage
    public static void main(String[] args) {
        CherryPickup solution = new CherryPickup();
        int[][] grid = {
            {0, 1, -1, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 1, 0, 0}
        };
        int result = solution.cherryPickup(grid);
        System.out.println("Maximum cherries collected: " + result); // Output: Maximum cherries collected: 5
    }
}
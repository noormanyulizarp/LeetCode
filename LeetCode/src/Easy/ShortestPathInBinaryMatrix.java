public class ShortestPathInBinaryMatrix {
    // This method finds the shortest path in a binary matrix from the top-left corner to the bottom-right corner.
    // The path can only move to adjacent cells (horizontally, vertically, or diagonally) and can only pass through cells with value 0.
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1; // No path if start or end is blocked
        }

        // Directions for moving in 8 possible ways
        int[][] directions = {
            {0, 1}, {1, 0}, {0, -1}, {-1, 0},
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };

        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // {row, col, distance}

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            // If we reach the bottom-right corner
            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            // Explore all 8 directions
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check if the new position is within bounds and not blocked
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                    grid[newRow][newCol] = 1; // Mark as visited
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                }
            }
        }

        return -1; // No path found
    }

    // Main method to test the shortestPathBinaryMatrix function
    public static void main(String[] args) {
        ShortestPathInBinaryMatrix spbm = new ShortestPathInBinaryMatrix();
        
        // Example grid
        int[][] grid = {
            {0, 0, 0},
            {1, 1, 0},
            {1, 1, 0}
        };

        // Expected output: 4 (the path is 0 -> 0 -> 0 -> 0)
        int result = spbm.shortestPathBinaryMatrix(grid);
        System.out.println("Shortest path length: " + result);
    }
}
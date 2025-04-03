public class BurstBalloons {
    /**
     * This method calculates the maximum coins that can be collected by bursting balloons.
     * 
     * @param nums an array of integers representing the number of coins in each balloon
     * @return the maximum coins that can be collected
     */
    public int maxCoins(int[] nums) {
        int n = nums.length;
        // Create a new array with padding to avoid boundary issues
        int[] balloons = new int[n + 2];
        balloons[0] = 1; // Padding
        balloons[n + 1] = 1; // Padding
        for (int i = 0; i < n; i++) {
            balloons[i + 1] = nums[i];
        }

        // dp[i][j] will store the maximum coins that can be collected by bursting balloons
        // between index i and j
        int[][] dp = new int[n + 2][n + 2];

        // Iterate over the length of the interval
        for (int length = 1; length <= n; length++) {
            for (int left = 0; left <= n - length; left++) {
                int right = left + length + 1; // right boundary
                // Calculate the maximum coins for the current interval
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right], 
                        dp[left][i] + dp[i][right] + balloons[left] * balloons[i] * balloons[right]);
                }
            }
        }
        return dp[0][n + 1]; // The result is stored in dp[0][n + 1]
    }

    public static void main(String[] args) {
        BurstBalloons solution = new BurstBalloons();
        int[] balloons = {3, 1, 5, 8};
        int maxCoins = solution.maxCoins(balloons);
        System.out.println("Maximum coins that can be collected: " + maxCoins);
    }
}

/*
Example Output:
Maximum coins that can be collected: 167
*/
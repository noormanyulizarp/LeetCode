// MinimumDifficultyOfJobSchedule.java
// This class provides a solution to the problem of scheduling jobs with minimum difficulty.
// The problem is defined as follows: Given a list of job difficulties and a number of days,
// we need to schedule the jobs such that the maximum difficulty of any day is minimized.

import java.util.Arrays;

public class MinimumDifficultyOfJobSchedule {
    
    // Function to calculate the minimum difficulty of job scheduling
    public static int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        
        // If there are fewer jobs than days, it's impossible to schedule
        if (n < d) return -1;

        // dp[i][j] represents the minimum difficulty to schedule jobs up to index i in j days
        int[][] dp = new int[n + 1][d + 1];
        
        // Initialize dp array with a large value
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Base case: 0 difficulty for 0 jobs in 0 days
        dp[0][0] = 0;

        // Fill the dp table
        for (int j = 1; j <= d; j++) {
            for (int i = j; i <= n; i++) {
                int maxDifficulty = 0;
                // Try to schedule jobs from i to k in the j-th day
                for (int k = i; k >= j; k--) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[k - 1]);
                    dp[i][j] = Math.min(dp[i][j], dp[k - 1][j - 1] + maxDifficulty);
                }
            }
        }

        // The answer is the minimum difficulty to schedule all jobs in d days
        return dp[n][d];
    }

    // Main method to test the minDifficulty function
    public static void main(String[] args) {
        int[] jobDifficulty = {6, 5, 4, 3, 2, 1};
        int d = 2;
        
        int result = minDifficulty(jobDifficulty, d);
        System.out.println("Minimum Difficulty of Job Schedule: " + result);
        // Expected output: 7 (Schedule jobs as [6, 5] and [4, 3, 2, 1])
    }
}
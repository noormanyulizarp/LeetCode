// MinimumCostToMergeStones.java
// This class provides a solution to the problem of merging stones with the minimum cost.
// The problem is defined as follows: You have a certain number of stones, and you can merge them in pairs.
// Each merge operation has a cost equal to the total number of stones being merged.
// The goal is to find the minimum cost to merge all stones into one.

import java.util.Arrays;

public class MinimumCostToMergeStones {
    
    // Function to calculate the minimum cost to merge stones
    public static int mergeStones(int[] stones, int K) {
        int n = stones.length;
        
        // If the number of stones is less than K or if (n - K) % (K - 1) != 0, return -1
        if (n < K || (n - K) % (K - 1) != 0) {
            return -1;
        }
        
        // Prefix sum array to calculate the sum of stones efficiently
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + stones[i];
        }
        
        // dp[i][j] will store the minimum cost to merge stones from index i to j
        int[][] dp = new int[n][n];
        
        // Initialize the dp array
        for (int len = K; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                
                // Try merging in groups of K
                for (int m = 1; m < len; m++) {
                    if ((len - m) % (K - 1) == 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][i + m - 1] + dp[i + m][j]);
                    }
                }
                
                // If we can merge all stones from i to j, add the cost of merging
                if (len == K) {
                    dp[i][j] += prefixSum[j + 1] - prefixSum[i];
                }
            }
        }
        
        return dp[0][n - 1];
    }

    // Main method to test the mergeStones function
    public static void main(String[] args) {
        int[] stones = {3, 2, 4, 1};
        int K = 2;
        int result = mergeStones(stones, K);
        
        // Output the result
        System.out.println("Minimum cost to merge stones: " + result);
    }
}
// KnapsackProblemExample.java
// This program demonstrates the 0/1 Knapsack problem using dynamic programming.
// The goal is to maximize the total value of items that can be carried in a knapsack
// without exceeding its weight capacity.

public class KnapsackProblemExample {
    // Function to solve the 0/1 Knapsack problem
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacity]; // The maximum value that can be carried
    }

    // Main method to test the knapsack function
    public static void main(String[] args) {
        int[] weights = {1, 2, 3}; // Weights of the items
        int[] values = {10, 15, 40}; // Values of the items
        int capacity = 6; // Maximum weight capacity of the knapsack

        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}

// Example Output:
// Maximum value in Knapsack = 55
// Explanation: The optimal solution is to take items with weights 2 and 3, 
// which gives a total value of 15 + 40 = 55.
// ClimbingStairs.java
// This program calculates the number of distinct ways to climb to the top of a staircase with n steps.
// Each time you can either climb 1 or 2 steps.

public class ClimbingStairs {
    
    // Method to calculate the number of ways to climb stairs
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // Base case: 1 way to climb 0 or 1 step
        }
        
        int[] dp = new int[n + 1]; // Array to store the number of ways to reach each step
        dp[0] = 1; // 1 way to stay on the ground (0 steps)
        dp[1] = 1; // 1 way to reach the first step (1 step)
        
        // Fill the dp array
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // The number of ways to reach step i
        }
        
        return dp[n]; // Return the number of ways to reach the nth step
    }

    // Main method to test the climbStairs function
    public static void main(String[] args) {
        int n = 5; // Example: number of steps
        int ways = climbStairs(n); // Calculate the number of ways to climb n steps
        System.out.println("Number of ways to climb " + n + " steps: " + ways);
    }
}

// Example output for n = 5:
// Number of ways to climb 5 steps: 8
// Explanation: The distinct ways to climb 5 steps are:
// 1. 1-1-1-1-1
// 2. 1-1-1-2
// 3. 1-1-2-1
// 4. 1-2-1-1
// 5. 2-1-1-1
// 6. 1-2-2
// 7. 2-1-2
// 8. 2-2-1
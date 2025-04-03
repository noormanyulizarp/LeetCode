public class CoinChange {
    /**
     * This method calculates the minimum number of coins needed to make a given amount.
     * 
     * @param coins an array of coin denominations
     * @param amount the total amount of money
     * @return the minimum number of coins needed to make the amount, or -1 if it's not possible
     */
    public static int coinChange(int[] coins, int amount) {
        // Create an array to store the minimum coins for each amount
        int[] dp = new int[amount + 1];
        // Initialize the dp array with a value greater than any possible number of coins
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        // Base case: 0 coins are needed to make the amount 0
        dp[0] = 0;

        // Iterate through each coin
        for (int coin : coins) {
            // Update the dp array for each amount that can be made with the current coin
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        // If dp[amount] is still amount + 1, it means we cannot make that amount
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        // Example usage
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        
        // Output the result
        System.out.println("Minimum coins needed: " + result); // Expected output: 3 (5 + 5 + 1)
    }
}
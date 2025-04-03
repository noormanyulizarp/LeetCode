// BestTimeToBuyAndSellStock.java
// This program solves the "Best Time to Buy and Sell Stock" problem.
// The goal is to find the maximum profit that can be achieved by buying and selling a stock once.

public class BestTimeToBuyAndSellStock {
    
    // Function to calculate the maximum profit
    public static int maxProfit(int[] prices) {
        // Initialize variables to track the minimum price and maximum profit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate through the price array
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate the profit if selling at the current price
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit; // Return the maximum profit found
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {
        // Example stock prices over a period
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        // Calculate the maximum profit
        int profit = maxProfit(prices);
        
        // Output the result
        System.out.println("Maximum profit: " + profit); // Expected output: 5
    }
}
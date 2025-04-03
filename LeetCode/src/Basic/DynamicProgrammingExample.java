// DynamicProgrammingExample.java
// This class demonstrates a basic example of dynamic programming
// by solving the Fibonacci sequence problem using memoization.

public class DynamicProgrammingExample {

    // Method to calculate the nth Fibonacci number using memoization
    public static int fibonacci(int n, int[] memo) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        
        // Check if the value is already computed
        if (memo[n] != 0) {
            return memo[n];
        }
        
        // Compute the value and store it in the memo array
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        int[] memo = new int[n + 1]; // Array to store computed Fibonacci values
        
        // Calculate the nth Fibonacci number
        int result = fibonacci(n, memo);
        
        // Output the result
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}

// Example Output:
// The 10th Fibonacci number is: 55

// Explanation:
// The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
// This example uses a memoization technique to optimize the recursive calculation of Fibonacci numbers, 
// significantly reducing the time complexity from exponential to linear.
// FibonacciExample.java
// This program demonstrates how to calculate Fibonacci numbers using both iterative and recursive methods.

public class FibonacciExample {
    
    // Method to calculate Fibonacci number using iteration
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b; // Calculate next Fibonacci number
            a = b;     // Update a to the previous Fibonacci number
            b = c;     // Update b to the current Fibonacci number
        }
        return c;
    }

    // Method to calculate Fibonacci number using recursion
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n; // Base case
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int n = 10; // Example input

        // Calculate Fibonacci number using iterative method
        System.out.println("Fibonacci number at position " + n + " (Iterative): " + fibonacciIterative(n));

        // Calculate Fibonacci number using recursive method
        System.out.println("Fibonacci number at position " + n + " (Recursive): " + fibonacciRecursive(n));
    }
}

// Example Output:
// Fibonacci number at position 10 (Iterative): 55
// Fibonacci number at position 10 (Recursive): 55
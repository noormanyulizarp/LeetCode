// FactorialExample.java
// This program demonstrates how to calculate the factorial of a number using recursion.
// Factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
// For example, factorial(5) = 5 * 4 * 3 * 2 * 1 = 120.

public class FactorialExample {
    
    // Method to calculate factorial recursively
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        // Example usage of the factorial method
        int number = 5; // Change this value to test with different numbers
        int result = factorial(number);
        
        // Output the result
        System.out.println("The factorial of " + number + " is: " + result);
    }
}

// Example output when running the program:
// The factorial of 5 is: 120
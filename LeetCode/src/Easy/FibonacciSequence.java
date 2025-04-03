// FibonacciSequence.java
// This program calculates the Fibonacci sequence up to a specified number of terms.
// The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = 10; // Specify the number of terms in the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Method to calculate the Fibonacci number at a specific position
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: return n if it's 0 or 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}

// Example Output:
// Fibonacci Sequence up to 10 terms:
// 0 1 1 2 3 5 8 13 21 34
// RecursionExample.java
// This class demonstrates the use of recursion in Java.
// It includes examples of calculating factorial and Fibonacci numbers using recursive methods.

public class RecursionExample {

    // Method to calculate factorial of a number using recursion
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    // Method to calculate Fibonacci number at a given position using recursion
    public static int fibonacci(int n) {
        // Base cases: Fibonacci of 0 is 0, Fibonacci of 1 is 1
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Example output for factorial
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number)); // Output: 120

        // Example output for Fibonacci
        int position = 6;
        System.out.println("Fibonacci number at position " + position + " is: " + fibonacci(position)); // Output: 8
    }
}
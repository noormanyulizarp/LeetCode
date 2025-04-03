// ExceptionHandlingExample.java
// This class demonstrates basic exception handling in Java.
// It includes examples of try-catch blocks and throwing exceptions.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Example 1: Handling ArithmeticException
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Example 2: Handling ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Fourth number: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        // Example 3: Throwing a custom exception
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b; // This may throw ArithmeticException
    }

    // Method to check age
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You must be at least 18 years old.");
        }
        System.out.println("Age is valid.");
    }
}

// Example Output:
// Error: Cannot divide by zero.
// Error: Array index is out of bounds.
// Error: You must be at least 18 years old.
// ArithmeticOperationsExample.java
// This class demonstrates basic arithmetic operations in Java.

public class ArithmeticOperationsExample {
    public static void main(String[] args) {
        // Example values
        int a = 10;
        int b = 5;

        // Performing arithmetic operations
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        double quotient = divide(a, b);

        // Displaying the results
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
        System.out.println("Division: " + a + " / " + b + " = " + quotient);
    }

    // Method to add two numbers
    public static int add(int x, int y) {
        return x + y;
    }

    // Method to subtract two numbers
    public static int subtract(int x, int y) {
        return x - y;
    }

    // Method to multiply two numbers
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Method to divide two numbers
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) x / y;
    }
}
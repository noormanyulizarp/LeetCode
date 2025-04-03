// SumExample.java
// This program demonstrates a simple example of summing two integers in Java.

public class SumExample {
    public static void main(String[] args) {
        // Define two integers
        int num1 = 10;
        int num2 = 20;

        // Call the sum method and store the result
        int result = sum(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    // Method to sum two integers
    public static int sum(int a, int b) {
        return a + b; // Return the sum of a and b
    }
}

// Example Output:
// The sum of 10 and 20 is: 30
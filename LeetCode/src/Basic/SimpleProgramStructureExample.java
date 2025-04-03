// SimpleProgramStructureExample.java
// This program demonstrates a basic structure of a Java program with a main method.

public class SimpleProgramStructureExample {
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Print a welcome message to the console
        System.out.println("Welcome to the Simple Program Structure Example!");

        // Call the method to demonstrate a simple calculation
        int result = addNumbers(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);
    }

    // Method to add two integers and return the result
    public static int addNumbers(int a, int b) {
        return a + b; // Return the sum of a and b
    }
}

// Example Output:
// Welcome to the Simple Program Structure Example!
// The sum of 5 and 10 is: 15
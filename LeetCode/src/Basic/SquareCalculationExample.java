// SquareCalculationExample.java
// This program demonstrates how to calculate the square of a number in Java.

import java.util.Scanner;

public class SquareCalculationExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to calculate its square: ");
        double number = scanner.nextDouble();
        
        // Calculate the square of the number
        double square = calculateSquare(number);
        
        // Display the result
        System.out.println("The square of " + number + " is: " + square);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate the square of a number
    public static double calculateSquare(double num) {
        return num * num;
    }
}

// Example Output:
// Enter a number to calculate its square: 5
// The square of 5.0 is: 25.0
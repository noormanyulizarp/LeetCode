// TriangleAreaCalculator.java
// This program calculates the area of a triangle given its base and height.

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = calculateArea(base, height);

        // Display the result
        System.out.printf("The area of the triangle with base %.2f and height %.2f is %.2f.%n", base, height, area);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height; // Area formula: (1/2) * base * height
    }
}

// Example Output:
// Enter the base of the triangle: 5
// Enter the height of the triangle: 10
// The area of the triangle with base 5.00 and height 10.00 is 25.00.
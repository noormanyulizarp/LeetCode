// DecimalToBinaryExample.java
// This program converts a decimal number to its binary representation.

import java.util.Scanner;

public class DecimalToBinaryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        
        // Convert decimal to binary
        String binaryRepresentation = decimalToBinary(decimalNumber);
        
        // Display the result
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryRepresentation);
        
        scanner.close();
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        
        // Handle the case for zero
        if (decimal == 0) {
            return "0";
        }
        
        // Convert decimal to binary
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); // Prepend the remainder
            decimal = decimal / 2; // Divide by 2
        }
        
        return binary.toString();
    }
}

// Example Output:
// Enter a decimal number: 10
// Binary representation of 10 is: 1010
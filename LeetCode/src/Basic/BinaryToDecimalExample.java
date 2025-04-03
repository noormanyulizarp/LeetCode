// BinaryToDecimalExample.java
// This program converts a binary number (as a string) to its decimal equivalent.

import java.util.Scanner;

public class BinaryToDecimalExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        // Convert binary to decimal
        int decimalValue = binaryToDecimal(binaryString);
        
        // Display the result
        System.out.println("The decimal value of binary " + binaryString + " is: " + decimalValue);
        
        scanner.close();
    }

    // Method to convert binary string to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // 2^0

        // Loop through the binary string in reverse
        for (int i = binary.length() - 1; i >= 0; i--) {
            // If the character is '1', add the corresponding power of 2
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; // Increase the base (2^n)
        }
        return decimal;
    }
}

// Example Output:
// Enter a binary number: 1011
// The decimal value of binary 1011 is: 11
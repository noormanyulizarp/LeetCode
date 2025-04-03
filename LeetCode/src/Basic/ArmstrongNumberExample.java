// ArmstrongNumberExample.java
// This program checks if a number is an Armstrong number.
// An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

import java.util.Scanner;

public class ArmstrongNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Count the number of digits

        // Calculate the sum of the digits raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise it to the power of digits and add to sum
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}

// Example Output:
// Enter a number: 153
// 153 is an Armstrong number.
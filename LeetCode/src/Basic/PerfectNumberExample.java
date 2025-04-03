// PerfectNumberExample.java
// This program checks if a number is a perfect number.
// A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself.

import java.util.Scanner;

public class PerfectNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        
        // Find divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // A number is perfect if the sum of its divisors equals the number itself
        return sum == num;
    }
}

// Example Output:
// Enter a positive integer: 6
// 6 is a perfect number.
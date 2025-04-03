// PrimeNumberChecker.java
// This class checks if a number is prime and provides example output.

public class PrimeNumberChecker {
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not a prime
            }
        }
        return true; // No divisors found, it's a prime number
    }

    // Main method to test the isPrime function
    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20};
        
        // Check each number and print whether it is prime
        for (int number : testNumbers) {
            System.out.println(number + " is prime? " + isPrime(number));
        }
    }
}

// Example output:
// 1 is prime? false
// 2 is prime? true
// 3 is prime? true
// 4 is prime? false
// 5 is prime? true
// 16 is prime? false
// 17 is prime? true
// 18 is prime? false
// 19 is prime? true
// 20 is prime? false
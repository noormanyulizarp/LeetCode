// PrimeNumberExample.java
// This program demonstrates how to check if a number is prime.
// A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers.

public class PrimeNumberExample {
    public static void main(String[] args) {
        int number = 29; // Example number to check for primality
        boolean isPrime = isPrime(number); // Check if the number is prime

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If num is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors were found, num is prime
    }
} 

// Example output for the number 29:
// 29 is a prime number.
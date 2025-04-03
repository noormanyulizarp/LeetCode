// PrimeFactorizationExample.java
// This program demonstrates how to find the prime factors of a given number.
// It includes a method to calculate the prime factors and a main method to test it.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizationExample {
    
    // Method to calculate the prime factors of a given number
    public static List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        
        // Check for number of 2s that divide number
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        
        // number must be odd at this point, so we can skip even numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            // While i divides number, add i and divide number
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        
        // This condition is to check if number is a prime number greater than 2
        if (number > 2) {
            factors.add(number);
        }
        
        return factors;
    }

    public static void main(String[] args) {
        int number = 56; // Example number
        List<Integer> factors = primeFactors(number);
        
        // Output the prime factors
        System.out.println("Prime factors of " + number + " are: " + factors);
    }
}

// Example Output:
// Prime factors of 56 are: [2, 2, 2, 7]
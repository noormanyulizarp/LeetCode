// TwoSumII.java
// This program solves the Two Sum II problem, where we need to find two numbers in a sorted array that add up to a specific target.
// The solution uses a two-pointer approach for optimal performance.

import java.util.Arrays;

public class TwoSumII {
    // Method to find the indices of the two numbers that add up to the target
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0; // Start pointer
        int right = numbers.length - 1; // End pointer

        while (left < right) {
            int sum = numbers[left] + numbers[right]; // Calculate the sum of the two pointers
            if (sum == target) {
                return new int[] { left + 1, right + 1 }; // Return 1-based indices
            } else if (sum < target) {
                left++; // Move the left pointer to the right
            } else {
                right--; // Move the right pointer to the left
            }
        }
        return new int[] {}; // Return an empty array if no solution is found
    }

    // Main method to test the twoSum method
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 }; // Example input
        int target = 9; // Example target
        int[] result = twoSum(numbers, target); // Call the twoSum method

        // Output the result
        System.out.println("Indices of the two numbers that add up to " + target + ": " + Arrays.toString(result));
    }
}

// Example output for the above input:
// Indices of the two numbers that add up to 9: [1, 2]
// File: ArraySumIndices.java
// This program finds the indices of two numbers in an array that add up to a specific target sum.

import java.util.HashMap;

public class ArraySumIndices {
    // Method to find indices of two numbers that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices if found
                return new int[] { map.get(complement), i };
            }
            // Store the number and its index in the map
            map.put(nums[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }

    // Main method to test the twoSum function
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Call the twoSum method
        int[] result = twoSum(nums, target);
        
        // Print the result
        if (result.length == 2) {
            System.out.println("Indices of the numbers that add up to " + target + " are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}

// Example output when running the main method:
// Indices of the numbers that add up to 9 are: 0 and 1
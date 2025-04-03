// TwoSumSolution.java
// This class provides a solution to the Two Sum problem.
// Given an array of integers and a target sum, it finds two numbers in the array that add up to the target sum.

import java.util.HashMap;

public class TwoSumSolution {
    
    // Method to find two indices of the numbers that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // If found, return the indices
                return new int[] { numMap.get(complement), i };
            }
            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }

    // Main method to test the twoSum function
    public static void main(String[] args) {
        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Call the twoSum method
        int[] result = twoSum(nums, target);
        
        // Output the result
        if (result.length == 2) {
            System.out.println("Indices of the numbers that add up to " + target + ": " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}

// Example output for the above input:
// Indices of the numbers that add up to 9: 0 and 1
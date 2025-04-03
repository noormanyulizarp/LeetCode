// SubarraySumEqualsK.java
// This class provides a solution to the problem of finding the number of continuous subarrays that sum to a given value k.

import java.util.HashMap;

public class SubarraySumEqualsK {
    
    // Method to find the number of continuous subarrays that sum to k
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store the cumulative sum and its frequency
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // Initialize with sum 0 having one count
        int count = 0; // To count the number of subarrays
        int cumulativeSum = 0; // To store the cumulative sum
        
        // Iterate through the array
        for (int num : nums) {
            cumulativeSum += num; // Update cumulative sum
            
            // Check if (cumulativeSum - k) exists in the map
            if (sumMap.containsKey(cumulativeSum - k)) {
                count += sumMap.get(cumulativeSum - k); // Increment count by the frequency of (cumulativeSum - k)
            }
            
            // Update the frequency of the cumulative sum in the map
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count; // Return the total count of subarrays
    }

    // Main method to test the subarraySum function
    public static void main(String[] args) {
        int[] nums = {1, 1, 1}; // Example input array
        int k = 2; // Target sum
        int result = subarraySum(nums, k); // Call the method
        
        // Output the result
        System.out.println("Number of subarrays that sum to " + k + ": " + result);
    }
}

// Example Output:
// Number of subarrays that sum to 2: 2
// Explanation: The subarrays are [1, 1] (from index 0 to 1) and [1, 1] (from index 1 to 2).
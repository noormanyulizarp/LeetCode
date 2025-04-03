// FirstMissingPositive.java
// This program finds the first missing positive integer from an unsorted integer array.

import java.util.HashSet;

public class FirstMissingPositive {
    
    // Function to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all positive numbers to the set
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        // Check for the first missing positive integer
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i; // Return the first missing positive
            }
        }
        
        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {3, 4, -1, 1};
        
        // Finding the first missing positive integer
        int result = firstMissingPositive(nums);
        
        // Output the result
        System.out.println("The first missing positive integer is: " + result);
    }
}

// Example Output:
// The first missing positive integer is: 2

// Explanation:
// In the given array [3, 4, -1, 1], the positive integers present are 1, 3, and 4.
// The smallest positive integer missing from this set is 2.
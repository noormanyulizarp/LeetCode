// SingleNumberFinder.java
// This program finds the single number in an array where every other number appears twice.
// It uses the XOR operation to achieve this in O(n) time complexity and O(1) space complexity.

public class SingleNumberFinder {
    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 1, 2, 1, 2};
        
        // Finding the single number
        int singleNumber = findSingleNumber(nums);
        
        // Output the result
        System.out.println("The single number is: " + singleNumber);
    }

    // Method to find the single number
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}

// Example Output:
// The single number is: 4

// Explanation:
// In the given array [4, 1, 2, 1, 2], all numbers appear twice except for 4. 
// The XOR operation cancels out the numbers that appear twice, leaving only the single number.
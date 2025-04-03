// ProductOfArrayExceptSelf.java
// This program calculates the product of an array except for the element at the current index.
// It does this without using division and in O(n) time complexity.

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];
        
        // Initialize the output array
        Arrays.fill(output, 1);
        
        // Calculate the prefix products
        int prefix = 1;
        for (int i = 0; i < length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }
        
        // Calculate the suffix products and multiply with the prefix products
        int suffix = 1;
        for (int i = length - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }
        
        return output;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3, 4};
        
        // Calculate the product of array except self
        int[] result = productExceptSelf(nums);
        
        // Print the result
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}

// Example Output:
// Input: [1, 2, 3, 4]
// Output: [24, 12, 8, 6]
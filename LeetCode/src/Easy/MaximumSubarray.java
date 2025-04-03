public class MaximumSubarray {
    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0]; // Initialize maxSoFar with the first element
        int currentMax = nums[0]; // Initialize currentMax with the first element

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentMax to be the maximum of the current element or the sum of currentMax and the current element
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Update maxSoFar if currentMax is greater
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar; // Return the maximum subarray sum
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // Call the maxSubArray function and print the result
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
    }
}
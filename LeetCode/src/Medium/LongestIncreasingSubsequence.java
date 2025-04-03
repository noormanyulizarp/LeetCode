// LongestIncreasingSubsequence.java
// This program finds the length of the longest increasing subsequence in an array of integers.
// The longest increasing subsequence is a subsequence of a sequence in which the elements are in sorted order, 
// and the subsequence is not required to be contiguous.

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    
    // Function to find the length of the longest increasing subsequence
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        // Create an array to store the longest increasing subsequence lengths
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1); // Each element is an increasing subsequence of length 1

        // Build the dp array
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // Find the maximum length from the dp array
        int maxLength = 0;
        for (int length : dp) {
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }

    // Main method to test the lengthOfLIS function
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
        // Example output: Length of Longest Increasing Subsequence: 4
        // Explanation: The longest increasing subsequence is [2, 3, 7, 101] with length 4.
    }
}
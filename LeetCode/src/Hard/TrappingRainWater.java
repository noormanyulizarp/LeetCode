// TrappingRainWater.java
// This class provides a solution to the "Trapping Rain Water" problem.
// The problem statement is as follows:
// Given an array of non-negative integers representing the height of bars,
// compute how much water it can trap after raining.

public class TrappingRainWater {
    
    // Function to calculate the amount of trapped rainwater
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0; // No water can be trapped
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        // Two-pointer approach
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]; // Update left max
                } else {
                    waterTrapped += leftMax - height[left]; // Calculate trapped water
                }
                left++; // Move left pointer
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]; // Update right max
                } else {
                    waterTrapped += rightMax - height[right]; // Calculate trapped water
                }
                right--; // Move right pointer
            }
        }

        return waterTrapped; // Return total trapped water
    }

    // Main method to test the trap function
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // Example input
        int result = trap(height); // Calculate trapped water
        System.out.println("Trapped rainwater: " + result); // Output the result
    }
}
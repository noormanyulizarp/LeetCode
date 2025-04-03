// ContainerWithMostWaterHard.java
// This program solves the "Container With Most Water" problem.
// Given an array of heights, it calculates the maximum area of water that can be contained between two lines.

public class ContainerWithMostWaterHard {
    // Function to calculate the maximum area of water that can be contained
    public static int maxArea(int[] height) {
        int left = 0; // Starting pointer
        int right = height.length - 1; // Ending pointer
        int maxArea = 0; // Variable to store the maximum area

        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the width between the two pointers
            int width = right - left;
            // Calculate the height as the minimum of the two heights
            int currentHeight = Math.min(height[left], height[right]);
            // Calculate the area and update maxArea if current area is larger
            maxArea = Math.max(maxArea, currentHeight * width);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea; // Return the maximum area found
    }

    // Main method to test the maxArea function
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Example input
        int result = maxArea(heights); // Call the function
        System.out.println("The maximum area of water that can be contained is: " + result);
        // Expected output: The maximum area of water that can be contained is: 49
    }
}
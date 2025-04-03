// MaxAreaCalculator.java
// This program calculates the maximum area of water that can be contained between two vertical lines
// given their heights and positions.

public class MaxAreaCalculator {
    // Function to calculate the maximum area
    public static int maxArea(int[] height) {
        int maxArea = 0; // Variable to store the maximum area
        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer

        // Loop until the left pointer is less than the right pointer
        while (left < right) {
            // Calculate the width between the two pointers
            int width = right - left;
            // Calculate the height as the minimum of the two heights
            int currentHeight = Math.min(height[left], height[right]);
            // Calculate the area and update maxArea if it's larger
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
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7}; // Example heights
        int result = maxArea(heights); // Call the maxArea function
        System.out.println("The maximum area is: " + result); // Output the result
    }
}

// Example output for the given heights array:
// The maximum area is: 49
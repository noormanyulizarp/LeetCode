// ContainerWithMostWater.java
// This program solves the "Container With Most Water" problem.
// Given an array of heights representing the elevation of walls, 
// the goal is to find two lines that together with the x-axis 
// form a container that can hold the most water.

public class ContainerWithMostWater {
    
    // Function to calculate the maximum area of water that can be contained
    public static int maxArea(int[] height) {
        int maxArea = 0; // Variable to store the maximum area
        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer
        
        // Loop until the two pointers meet
        while (left < right) {
            // Calculate the width and height of the container
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            // Calculate the area and update maxArea if needed
            maxArea = Math.max(maxArea, width * h);
            
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
        int[] heights = {1,8,6,2,5,4,8,3,7}; // Example input
        int result = maxArea(heights); // Call the function
        System.out.println("The maximum area of water that can be contained is: " + result);
        // Expected output: The maximum area of water that can be contained is: 49
    }
}
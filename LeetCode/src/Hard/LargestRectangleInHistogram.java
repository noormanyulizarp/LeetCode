// LargestRectangleInHistogram.java
// This program calculates the area of the largest rectangle that can be formed in a histogram.
// The histogram is represented by an array of integers where each integer represents the height of a bar.

import java.util.Stack;

public class LargestRectangleInHistogram {
    
    // Function to calculate the largest rectangle area in a histogram
    public static int largestRectangleArea(int[] heights) {
        // Stack to store the indices of the bars
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            // If this bar is higher than the bar at stack top, push it to the stack
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                // Pop the top
                int top = stack.pop();
                // Calculate the area with heights[top] as the smallest (or minimum height) bar 'h'
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                // Update max area, if needed
                maxArea = Math.max(maxArea, area);
            }
        }

        // Now pop the remaining bars from stack and calculate area with every popped bar
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Main method to test the largestRectangleArea function
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = largestRectangleArea(heights);
        System.out.println("The area of the largest rectangle is: " + result);
    }
}

// Example Output:
// The area of the largest rectangle is: 10
// Explanation: The largest rectangle can be formed between the heights 5 and 6, which gives an area of 5 * 2 = 10.
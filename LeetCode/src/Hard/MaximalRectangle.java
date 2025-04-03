public class MaximalRectangle {
    // Function to calculate the maximal rectangle area in a binary matrix
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int[] heights = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Update heights array
                heights[j] = (matrix[i][j] == '1') ? heights[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }

    // Helper function to calculate the largest rectangle area in a histogram
    private int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] stack = new int[heights.length + 1];
        int index = 0;

        for (int i = 0; i < heights.length; i++) {
            while (index > 0 && heights[stack[index - 1]] > heights[i]) {
                int height = heights[stack[--index]];
                int width = (index == 0) ? i : i - stack[index - 1] - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack[index++] = i;
        }

        while (index > 0) {
            int height = heights[stack[--index]];
            int width = (index == 0) ? heights.length : heights.length - stack[index - 1] - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        MaximalRectangle solution = new MaximalRectangle();
        
        // Example binary matrix
        char[][] matrix = {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'}
        };

        // Calculate the maximal rectangle area
        int result = solution.maximalRectangle(matrix);
        System.out.println("The maximal rectangle area is: " + result); // Expected output: 6
    }
}
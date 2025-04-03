public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Spiral Order Traversal:");
        for (int num : spiralOrder(matrix)) {
            System.out.print(num + " ");
        }
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int[] result = new int[(bottom + 1) * (right + 1)];
        int index = 0;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result[index++] = matrix[top][i];
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    result[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }

        return result;
    }
} 

/*
Example Output:
Spiral Order Traversal:
1 2 3 6 9 8 7 4 5 
*/ 

/*
This program defines a method to traverse a 2D matrix in spiral order. 
The main method initializes a sample matrix and prints the elements in spiral order.
*/
// MatrixTransposeExample.java
// This program demonstrates how to transpose a matrix in Java.
// A transposed matrix is obtained by swapping the rows and columns of the original matrix.

public class MatrixTransposeExample {
    public static void main(String[] args) {
        // Define a 2D array (matrix)
        int[][] originalMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(originalMatrix);

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

// Example Output:
// Original Matrix:
// 1 2 3 
// 4 5 6 
// 7 8 9 
// Transposed Matrix:
// 1 4 7 
// 2 5 8 
// 3 6 9 
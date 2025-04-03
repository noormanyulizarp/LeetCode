// MatrixMultiplicationExample.java
// This program demonstrates how to perform matrix multiplication in Java.

public class MatrixMultiplicationExample {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Perform matrix multiplication
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // Print the result
        System.out.println("Result of Matrix Multiplication:");
        printMatrix(result);
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        // Validate matrix dimensions
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Matrix A columns must match Matrix B rows.");
        }

        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        // Create a result matrix
        int[][] result = new int[rowsA][colsB];

        // Perform multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
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
// Result of Matrix Multiplication:
// 58 64 
// 139 154 
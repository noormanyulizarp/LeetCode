public class RotateMatrix {
    public static void main(String[] args) {
        // Example input matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix 90 degrees clockwise
        rotate(matrix);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // First, transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Then, reverse each row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    // Helper function to reverse an array
    private static void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }

    // Helper function to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
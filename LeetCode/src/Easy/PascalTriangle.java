public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5; // Number of rows in Pascal's Triangle
        int[][] triangle = generate(numRows);
        
        // Print the generated Pascal's Triangle
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to generate Pascal's Triangle
    public static int[][] generate(int numRows) {
        int[][] triangle = new int[numRows][];
        
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; // Each row has i + 1 elements
            triangle[i][0] = 1; // First element of each row is 1
            triangle[i][i] = 1; // Last element of each row is 1
            
            // Fill in the values for the current row
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
} 

/*
Example Output:
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
*/ 

// This program generates Pascal's Triangle up to a specified number of rows.
// Each row is constructed based on the values from the previous row. 
// The first and last elements of each row are always 1, 
// while the other elements are the sum of the two elements above them.
// ValidSudoku.java
// This class provides a solution to the "Valid Sudoku" problem.
// The goal is to determine if a given 9x9 Sudoku board is valid according to the rules of Sudoku.

public class ValidSudoku {
    
    // Method to check if a given Sudoku board is valid
    public static boolean isValidSudoku(char[][] board) {
        // Create arrays to track the presence of numbers in rows, columns, and boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        // Iterate through each cell in the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') { // Only check filled cells
                    int n = num - '1'; // Convert char to index (0-8)
                    int boxIndex = (i / 3) * 3 + (j / 3); // Calculate box index

                    // Check if the number has already been seen in the current row, column, or box
                    if (rows[i][n] || cols[j][n] || boxes[boxIndex][n]) {
                        return false; // Invalid Sudoku
                    }

                    // Mark the number as seen
                    rows[i][n] = true;
                    cols[j][n] = true;
                    boxes[boxIndex][n] = true;
                }
            }
        }
        return true; // Valid Sudoku
    }

    // Main method to test the isValidSudoku function
    public static void main(String[] args) {
        // Example Sudoku board (valid)
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Check if the board is valid and print the result
        boolean isValid = isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + isValid);
    }
}
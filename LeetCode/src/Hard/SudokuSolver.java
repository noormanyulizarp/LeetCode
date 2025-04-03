// SudokuSolver.java
// This class provides a solution to the Sudoku solving problem.
// It uses a backtracking algorithm to fill the Sudoku board.

public class SudokuSolver {
    
    // Method to solve the Sudoku puzzle
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    // Backtracking method to solve the Sudoku
    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // If the cell is empty (represented by '.')
                if (board[row][col] == '.') {
                    // Try digits from '1' to '9'
                    for (char num = '1'; num <= '9'; num++) {
                        // Check if it's safe to place the number
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number

                            // Recursively attempt to solve the rest of the board
                            if (solve(board)) {
                                return true; // If solved, return true
                            }

                            // If placing num didn't lead to a solution, reset the cell
                            board[row][col] = '.';
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Solved
    }

    // Method to check if it's safe to place a number in a given cell
    private boolean isSafe(char[][] board, int row, int col, char num) {
        // Check the row and column
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false; // Number already exists in row or column
            }
        }

        // Check the 3x3 box
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false; // Number already exists in the box
                }
            }
        }
        return true; // Safe to place the number
    }

    // Main method to test the SudokuSolver
    public static void main(String[] args) {
        SudokuSolver solver = new SudokuSolver();
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

        System.out.println("Sudoku board before solving:");
        printBoard(board);
        solver.solveSudoku(board);
        System.out.println("Sudoku board after solving:");
        printBoard(board);
    }

    // Method to print the Sudoku board
    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
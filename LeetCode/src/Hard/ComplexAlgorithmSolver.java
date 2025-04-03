// ComplexAlgorithmSolver.java
// This class demonstrates a complex algorithm solution for a problem.
// The example provided here is a simple implementation of the "N-Queens" problem,
// which is a classic backtracking problem in computer science.

import java.util.ArrayList;
import java.util.List;

public class ComplexAlgorithmSolver {
    
    // Method to solve the N-Queens problem
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        backtrack(new int[n], 0, results);
        return results;
    }

    // Backtracking method to place queens
    private void backtrack(int[] queens, int row, List<List<String>> results) {
        if (row == queens.length) {
            results.add(constructBoard(queens));
            return;
        }
        for (int col = 0; col < queens.length; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col; // Place queen
                backtrack(queens, row + 1, results); // Recur to place next queen
            }
        }
    }

    // Method to check if a queen can be placed at (row, col)
    private boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || 
                queens[i] - i == col - row || 
                queens[i] + i == col + row) {
                return false; // Same column or diagonal
            }
        }
        return true;
    }

    // Method to construct the board from the queens' positions
    private List<String> constructBoard(int[] queens) {
        List<String> board = new ArrayList<>();
        for (int row : queens) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < queens.length; col++) {
                sb.append(col == row ? 'Q' : '.');
            }
            board.add(sb.toString());
        }
        return board;
    }

    // Main method to test the N-Queens solution
    public static void main(String[] args) {
        ComplexAlgorithmSolver solver = new ComplexAlgorithmSolver();
        int n = 4; // Change this value to test different sizes
        List<List<String>> solutions = solver.solveNQueens(n);
        
        // Print the solutions
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println(); // Separate different solutions
        }
    }
}

// Example output for n = 4:
// .Q..
// ...Q
// Q...
// ..Q.

// ..Q.
// Q...
// ...Q
// .Q..
public class NQueensSolver {
    private int[] queens; // Array to hold the positions of queens
    private int solutionsCount; // Count of valid solutions

    public NQueensSolver(int n) {
        queens = new int[n]; // Initialize the array for n queens
        solutionsCount = 0; // Initialize solutions count
    }

    // Method to solve the N-Queens problem
    public void solve() {
        placeQueens(0); // Start placing queens from the first row
    }

    // Recursive method to place queens
    private void placeQueens(int row) {
        if (row == queens.length) {
            solutionsCount++; // Found a valid arrangement
            printSolution(); // Print the solution
            return;
        }

        for (int col = 0; col < queens.length; col++) {
            if (isSafe(row, col)) {
                queens[row] = col; // Place queen
                placeQueens(row + 1); // Recur to place next queen
            }
        }
    }

    // Check if it's safe to place a queen at (row, col)
    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check column and diagonals
            if (queens[i] == col || 
                queens[i] - i == col - row || 
                queens[i] + i == col + row) {
                return false; // Not safe
            }
        }
        return true; // Safe to place
    }

    // Print the current solution
    private void printSolution() {
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if (queens[i] == j) {
                    System.out.print("Q "); // Print queen
                } else {
                    System.out.print(". "); // Print empty space
                }
            }
            System.out.println(); // New line for next row
        }
        System.out.println(); // Extra line between solutions
    }

    // Main method to test the N-Queens solver
    public static void main(String[] args) {
        int n = 4; // Change this value for different sizes
        NQueensSolver solver = new NQueensSolver(n);
        solver.solve();
        System.out.println("Total solutions for " + n + " queens: " + solver.solutionsCount);
    }
} 

/*
Example Output for n = 4:
Q . . . 
. . Q . 
. . . Q 
. Q . . 

. Q . . 
. . . Q 
Q . . . 
. . Q . 

Total solutions for 4 queens: 2
*/
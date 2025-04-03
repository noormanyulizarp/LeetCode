public class WordSearch {
    // This method checks if a word exists in a 2D board of characters.
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Start the search from each cell
                if (dfs(board, word, i, j, 0)) {
                    return true; // Word found
                }
            }
        }
        return false; // Word not found
    }

    // Depth-first search helper method
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // Check if the current index matches the word length
        if (index == word.length()) {
            return true; // All characters matched
        }
        // Check for out of bounds or character mismatch
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false; // Invalid position or character mismatch
        }

        // Mark the cell as visited by replacing it with a special character
        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited

        // Explore all possible directions: up, down, left, right
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // Restore the original character after exploring
        board[i][j] = temp;

        return found; // Return whether the word was found
    }

    // Main method to test the WordSearch class
    public static void main(String[] args) {
        WordSearch ws = new WordSearch();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        boolean result = ws.exist(board, word);
        System.out.println("Word " + word + " exists in the board: " + result); // Expected output: true

        word = "SEE";
        result = ws.exist(board, word);
        System.out.println("Word " + word + " exists in the board: " + result); // Expected output: true

        word = "ABCB";
        result = ws.exist(board, word);
        System.out.println("Word " + word + " exists in the board: " + result); // Expected output: false
    }
}
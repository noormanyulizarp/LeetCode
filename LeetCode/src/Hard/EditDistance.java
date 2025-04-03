public class EditDistance {
    /**
     * This method calculates the minimum edit distance between two strings.
     * The edit distance is the minimum number of operations required to convert
     * one string into another. The allowed operations are insertion, deletion, 
     * and substitution of a single character.
     *
     * @param word1 The first string
     * @param word2 The second string
     * @return The minimum edit distance between word1 and word2
     */
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        // Create a DP table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the DP table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j; // If word1 is empty, all characters of word2 need to be inserted
                } else if (j == 0) {
                    dp[i][j] = i; // If word2 is empty, all characters of word1 need to be deleted
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No operation needed
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], // Deletion
                                           Math.min(dp[i][j - 1], // Insertion
                                                    dp[i - 1][j - 1])); // Substitution
                }
            }
        }
        return dp[m][n]; // The last cell contains the answer
    }

    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        
        // Calculate the minimum edit distance
        int distance = minDistance(word1, word2);
        
        // Output the result
        System.out.println("The minimum edit distance between \"" + word1 + "\" and \"" + word2 + "\" is: " + distance);
    }
} 

/*
Example Output:
The minimum edit distance between "horse" and "ros" is: 3
*/
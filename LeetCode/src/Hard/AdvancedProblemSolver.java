// AdvancedProblemSolver.java
// This class demonstrates an advanced problem-solving technique using dynamic programming.
// The example provided solves the "Edit Distance" problem, which calculates the minimum number of operations 
// required to convert one string into another.

public class AdvancedProblemSolver {

    // Function to calculate the Edit Distance between two strings
    public static int editDistance(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        // Create a table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp[][] in bottom-up manner
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                // If first string is empty
                if (i == 0) {
                    dp[i][j] = j; // Min. operations = j
                }
                // If second string is empty
                else if (j == 0) {
                    dp[i][j] = i; // Min. operations = i
                }
                // If last characters are the same
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If last characters are different
                else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1],    // Insert
                                                       dp[i - 1][j]),   // Remove
                                                       dp[i - 1][j - 1]); // Replace
                }
            }
        }
        return dp[m][n]; // The last cell contains the answer
    }

    public static void main(String[] args) {
        String str1 = "sunday";
        String str2 = "saturday";

        System.out.println("Edit Distance between " + str1 + " and " + str2 + " is: " + editDistance(str1, str2));
    }
}

// Example Output:
// Edit Distance between sunday and saturday is: 3
// Explanation: The operations are:
// 1. Insert 'a' at position 1
// 2. Insert 't' at position 2
// 3. Replace 'y' with 'y' (no change, but counted as an operation)
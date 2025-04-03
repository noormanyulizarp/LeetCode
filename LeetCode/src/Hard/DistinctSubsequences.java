public class DistinctSubsequences {
    /**
     * This method calculates the number of distinct subsequences of a string `s` that equals another string `t`.
     * It uses dynamic programming to build a solution iteratively.
     *
     * @param s the source string
     * @param t the target string
     * @return the number of distinct subsequences of `s` that equals `t`
     */
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        // Create a 2D array to store the number of distinct subsequences
        int[][] dp = new int[n + 1][m + 1];
        
        // An empty string is a subsequence of any string
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 1;
        }
        
        // Fill the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        
        return dp[n][m];
    }

    public static void main(String[] args) {
        DistinctSubsequences solution = new DistinctSubsequences();
        
        // Example 1
        String s1 = "rabbbit";
        String t1 = "rabbit";
        System.out.println("Number of distinct subsequences: " + solution.numDistinct(s1, t1)); // Output: 3
        
        // Example 2
        String s2 = "abc";
        String t2 = "abc";
        System.out.println("Number of distinct subsequences: " + solution.numDistinct(s2, t2)); // Output: 1
        
        // Example 3
        String s3 = "aabb";
        String t3 = "ab";
        System.out.println("Number of distinct subsequences: " + solution.numDistinct(s3, t3)); // Output: 4
    }
}
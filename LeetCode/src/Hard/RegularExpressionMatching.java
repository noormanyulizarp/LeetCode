// RegularExpressionMatching.java
// This class provides a solution to the Regular Expression Matching problem.
// It implements a method to determine if a given string matches a pattern that may include '.' and '*'.
// The '.' character matches any single character, while '*' matches zero or more of the preceding element.

public class RegularExpressionMatching {
    
    // Method to check if the input string matches the pattern
    public boolean isMatch(String s, String p) {
        // Create a 2D array to store the results of subproblems
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        
        // Base case: empty string and empty pattern match
        dp[0][0] = true;

        // Handle patterns with '*' that can match empty string
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // Fill the dp table
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                // If characters match or pattern has '.', carry over the result from the previous state
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If pattern has '*', we have two cases:
                // 1. We ignore the '*' and the preceding character
                // 2. We use the '*' to match one or more of the preceding character
                else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.'));
                }
            }
        }

        // The result is in the bottom-right corner of the dp table
        return dp[s.length()][p.length()];
    }

    // Main method to test the isMatch function
    public static void main(String[] args) {
        RegularExpressionMatching matcher = new RegularExpressionMatching();
        
        // Test cases
        String s1 = "aab";
        String p1 = "c*a*b";
        System.out.println("Is match: " + matcher.isMatch(s1, p1)); // Expected output: true

        String s2 = "mississippi";
        String p2 = "mis*is*p*.";
        System.out.println("Is match: " + matcher.isMatch(s2, p2)); // Expected output: false
    }
}
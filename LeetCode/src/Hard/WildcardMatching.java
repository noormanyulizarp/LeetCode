public class WildcardMatching {
    /**
     * This method checks if the input string matches the pattern with wildcards.
     * The pattern can contain '*' which matches any sequence of characters
     * and '?' which matches a single character.
     *
     * @param s the input string
     * @param p the pattern string
     * @return true if the string matches the pattern, false otherwise
     */
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        
        // Base case: empty pattern matches empty string
        dp[0][0] = true;

        // Handle patterns with leading '*' characters
        for (int j = 1; j <= pLen; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the dp table
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[sLen][pLen];
    }

    public static void main(String[] args) {
        WildcardMatching wm = new WildcardMatching();
        
        // Test cases
        String s1 = "adceb";
        String p1 = "*a*b";
        System.out.println("Is match: " + wm.isMatch(s1, p1)); // Expected: true

        String s2 = "acdcb";
        String p2 = "a*c?b";
        System.out.println("Is match: " + wm.isMatch(s2, p2)); // Expected: false
    }
}
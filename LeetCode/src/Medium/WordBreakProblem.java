public class WordBreakProblem {
    /**
     * This method checks if a string can be segmented into a space-separated sequence
     * of one or more dictionary words.
     *
     * @param s the string to be checked
     * @param wordDict the dictionary of words
     * @return true if the string can be segmented, false otherwise
     */
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // base case: empty string can be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        // Example usage
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean result = wordBreak(s, wordDict);
        System.out.println("Can the string \"" + s + "\" be segmented? " + result);
        // Output: Can the string "leetcode" be segmented? true
    }
}
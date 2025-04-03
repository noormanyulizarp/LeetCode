public class LongestCommonPrefix {
    /**
     * This method finds the longest common prefix string amongst an array of strings.
     * If there is no common prefix, it returns an empty string "".
     *
     * @param strs an array of strings
     * @return the longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                // If there's no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        
        // Example input
        String[] input = {"flower", "flow", "flight"};
        String result = lcp.longestCommonPrefix(input);
        
        // Output the result
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
        
        // Another example
        String[] input2 = {"dog", "racecar", "car"};
        String result2 = lcp.longestCommonPrefix(input2);
        
        // Output the result
        System.out.println("Longest Common Prefix: " + result2); // Output: ""
    }
}
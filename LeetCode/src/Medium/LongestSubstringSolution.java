public class LongestSubstringSolution {
    /**
     * This method finds the length of the longest substring without repeating characters.
     * 
     * @param s The input string to be analyzed.
     * @return The length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            // If the character is already in the map, move the left pointer
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(charIndexMap.get(currentChar) + 1, left);
            }
            // Update the last seen index of the character
            charIndexMap.put(currentChar, right);
            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringSolution solution = new LongestSubstringSolution();
        
        // Example input
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        
        // Output the result
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
    }
}
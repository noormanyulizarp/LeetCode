public class LongestSubstringCalculator {
    /**
     * This method finds the length of the longest substring without repeating characters.
     * 
     * @param s the input string
     * @return the length of the longest substring without repeating characters
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        // HashSet to store the characters in the current substring
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // If the character is already in the set, remove characters from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            charSet.add(s.charAt(right));
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
        // Expected output: 3 (The answer is "abc", with the length of 3)
    }
}
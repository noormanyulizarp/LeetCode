public class LongestSubstringHardExample {
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
        int[] charIndex = new int[128]; // Assuming ASCII characters

        for (int right = 0; right < n; right++) {
            left = Math.max(charIndex[s.charAt(right)], left);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[s.charAt(right)] = right + 1; // Update the last index of the character
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
        
        // Example output for different inputs
        System.out.println("Example outputs:");
        System.out.println("Input: \"bbbbb\" -> Output: " + lengthOfLongestSubstring("bbbbb")); // Output: 1
        System.out.println("Input: \"pwwkew\" -> Output: " + lengthOfLongestSubstring("pwwkew")); // Output: 3
        System.out.println("Input: \"\" -> Output: " + lengthOfLongestSubstring("")); // Output: 0
    }
}
public class LongestSubstringHardCalculator {
    /**
     * This method finds the length of the longest substring without repeating characters.
     * 
     * @param s The input string to be analyzed.
     * @return The length of the longest substring without repeating characters.
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128]; // Assuming ASCII characters

        for (int right = 0; right < n; right++) {
            // If the character is already in the substring, move the left pointer
            if (charIndex[s.charAt(right)] > left) {
                left = charIndex[s.charAt(right)];
            }
            // Update the last index of the character
            charIndex[s.charAt(right)] = right + 1;
            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
        // Expected output: 3 (The longest substring is "abc")
    }
}
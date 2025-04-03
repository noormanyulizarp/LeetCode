public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Expected output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Expected output: 3
        System.out.println(lengthOfLongestSubstring(""));         // Expected output: 0
    }

    /**
     * This method finds the length of the longest substring without repeating characters.
     * 
     * @param s the input string
     * @return the length of the longest substring without repeating characters
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0; // Left pointer for the sliding window
        int[] charIndex = new int[128]; // Array to store the last index of each character

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            // If the character is already in the substring, move the left pointer
            if (charIndex[currentChar] > left) {
                left = charIndex[currentChar];
            }
            // Update the last index of the character
            charIndex[currentChar] = right + 1; // Store the index + 1 to differentiate between seen and not seen
            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
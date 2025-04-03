public class SubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + length);
    }

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
            // Update the last seen index of the character
            charIndex[s.charAt(right)] = right + 1; // Store the index + 1 to differentiate between seen and not seen
            // Calculate the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
} 

/*
Example Output:
The length of the longest substring without repeating characters in "abcabcbb" is: 3
*/
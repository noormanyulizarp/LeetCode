// LongestSubstringHardExample3.java
// This program finds the length of the longest substring without repeating characters.
// It uses a sliding window approach to efficiently track the characters in the current substring.

import java.util.HashMap;

public class LongestSubstringHardExample3 {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
    }

    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Left boundary of the sliding window

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the character is already in the map, move the start pointer
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the last seen index of the character
            charIndexMap.put(currentChar, end);
            // Calculate the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
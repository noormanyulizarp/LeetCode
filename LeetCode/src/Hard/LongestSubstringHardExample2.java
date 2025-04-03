// LongestSubstringHardExample2.java
// This program finds the length of the longest substring without repeating characters.
// It uses a sliding window approach to efficiently track the characters in the current substring.

import java.util.HashMap;

public class LongestSubstringHardExample2 {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters in \"" + input + "\" is: " + result);
    }

    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is already in the map, move the start index
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the character
            charIndexMap.put(currentChar, i);
            // Calculate the maximum length
            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
}
public class MergeStringsAlternately {
    public static void main(String[] args) {
        // Example strings to merge
        String str1 = "abc";
        String str2 = "12345";

        // Merging the strings
        String mergedString = mergeAlternately(str1, str2);

        // Output the result
        System.out.println("Merged String: " + mergedString);
    }

    /**
     * Merges two strings by alternating characters from each string.
     * If one string is longer, the remaining characters are appended at the end.
     *
     * @param str1 the first string
     * @param str2 the second string
     * @return the merged string
     */
    public static String mergeAlternately(String str1, String str2) {
        StringBuilder merged = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);

        // Alternate characters from both strings
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(str1.charAt(i));
            }
            if (i < length2) {
                merged.append(str2.charAt(i));
            }
        }

        return merged.toString();
    }
} 

// Example Output:
// Merged String: a1b2c345
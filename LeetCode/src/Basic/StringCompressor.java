public class StringCompressor {
    /**
     * Compresses a string using the counts of repeated characters.
     * For example, the string "aabcccccaaa" would become "a2b1c5a3".
     * If the compressed string is not smaller than the original string,
     * the original string is returned.
     *
     * @param input the string to be compressed
     * @return the compressed string or the original string if compression does not reduce size
     */
    public static String compress(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1; // reset count
            }
        }
        // Append the last character and its count
        compressed.append(input.charAt(input.length() - 1)).append(count);

        // Return the original string if compressed is not smaller
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "aabcccccaaa";
        String compressed = compress(input);
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressed);
    }
} 

// Example Output:
// Original: aabcccccaaa
// Compressed: a2b1c5a3
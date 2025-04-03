public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingCharacter(input);
        System.out.println("The first non-repeating character in \"" + input + "\" is: " + result);
    }

    /**
     * This method finds the first non-repeating character in a given string.
     * 
     * @param str The input string to be checked.
     * @return The first non-repeating character, or a space if none exists.
     */
    public static char firstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return ' '; // Return space if no non-repeating character is found
    }
}
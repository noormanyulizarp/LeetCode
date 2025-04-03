public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "leetcode";
        int index = firstUniqueCharacter(input);
        System.out.println("The index of the first unique character in \"" + input + "\" is: " + index);
    }

    /**
     * This method finds the index of the first unique character in a given string.
     * 
     * @param s The input string to be analyzed.
     * @return The index of the first unique character, or -1 if there are no unique characters.
     */
    public static int firstUniqueCharacter(String s) {
        int[] charCount = new int[26]; // Array to store the count of each character

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index if the character is unique
            }
        }

        return -1; // Return -1 if no unique character is found
    }
}
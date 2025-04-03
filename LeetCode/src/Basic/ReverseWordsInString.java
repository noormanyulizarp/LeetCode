// ReverseWordsInString.java
// This program reverses the words in a given string while maintaining the order of the words.

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "Hello World from Java";
        String output = reverseWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }

    // Method to reverse the words in a given string
    public static String reverseWords(String s) {
        // Split the string into words using space as a delimiter
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
    }
}
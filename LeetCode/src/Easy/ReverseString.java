public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    // Method to reverse a given string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        int left = 0; // Starting index
        int right = charArray.length - 1; // Ending index

        // Swap characters until the left index is less than the right index
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
} 

// Example Output:
// Original: Hello, World!
// Reversed: !dlroW ,olleH

// This program defines a method to reverse a string and demonstrates its usage in the main method.
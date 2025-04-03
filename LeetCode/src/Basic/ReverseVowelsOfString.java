public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String input = "hello";
        String result = reverseVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    // Function to reverse the vowels in a given string
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer to the previous vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap the vowels
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}

/*
Example Output:
Input: hello
Output: holle

Explanation:
In the input string "hello", the vowels are 'e' and 'o'. 
After reversing the vowels, the output becomes "holle".
*/
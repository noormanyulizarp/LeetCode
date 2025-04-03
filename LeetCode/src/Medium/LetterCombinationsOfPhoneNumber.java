public class LetterCombinationsOfPhoneNumber {
    // Mapping of digits to letters
    private static final String[] MAPPING = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String digits = "23"; // Example input
        System.out.println("Input Digits: " + digits);
        System.out.println("Letter Combinations: " + letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private static void backtrack(List<String> combinations, StringBuilder combination, String digits, int index) {
        // If the combination is the same length as digits, add it to the list
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

        // Get the letters that the current digit maps to, and loop through them
        String letters = MAPPING[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            combination.append(letter); // Add the letter to the combination
            backtrack(combinations, combination, digits, index + 1); // Move to the next digit
            combination.deleteCharAt(combination.length() - 1); // Remove the last letter for backtracking
        }
    }
} 

// Example Output:
// Input Digits: 23
// Letter Combinations: [ad, ae, af, bd, be, bf, cd, ce, cf]
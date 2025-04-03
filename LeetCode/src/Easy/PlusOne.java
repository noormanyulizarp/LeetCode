public class PlusOne {
    /**
     * This method takes an array of digits representing a non-negative integer
     * and increments the integer by one. The digits are stored such that the
     * most significant digit is at the head of the list, and each element in
     * the array is a single digit.
     *
     * @param digits an array of integers representing the digits of the number
     * @return a new array of integers representing the incremented number
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and work backwards
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set the current digit to 0 if it was 9
            digits[i] = 0;
        }

        // If we have gone through all digits and they are all 0, we need to add a new digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // The new most significant digit
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        
        // Example input
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        
        // Output the result
        System.out.print("Input: [1, 2, 3] -> Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Another example
        int[] digits2 = {9, 9, 9};
        int[] result2 = solution.plusOne(digits2);
        
        // Output the result
        System.out.print("Input: [9, 9, 9] -> Output: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
public class RomanToInteger {
    /**
     * This method converts a Roman numeral to an integer.
     * 
     * @param s The Roman numeral as a string.
     * @return The integer value of the Roman numeral.
     */
    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        // Map of Roman numerals to their integer values
        int[] values = new int[256];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;

        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values[s.charAt(i)];

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }
            prevValue = currentValue; // Update the previous value
        }

        return total;
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        
        // Example usage
        String roman = "MCMXCIV"; // 1994
        int result = converter.romanToInt(roman);
        
        // Output the result
        System.out.println("The integer value of Roman numeral " + roman + " is: " + result);
    }
}
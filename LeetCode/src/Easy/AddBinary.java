public class AddBinary {
    public static void main(String[] args) {
        // Example inputs
        String a = "1010"; // Binary representation of 10
        String b = "1011"; // Binary representation of 11
        
        // Call the addBinary method and print the result
        String result = addBinary(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + result); // Expected output: 11001
    }

    // Method to add two binary strings
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0; // Initialize carry to 0
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b

        // Loop until both strings are processed
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Start with carry

            // Add the current digit of a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }

            // Add the current digit of b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }

            // Update carry for next iteration
            carry = sum / 2;
            // Append the current digit to the result
            result.append(sum % 2);
        }

        // The result is in reverse order, so reverse it before returning
        return result.reverse().toString();
    }
}
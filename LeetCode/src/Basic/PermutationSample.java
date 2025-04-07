public class PermutationSample {
    // Method to generate permutations of a string
    public void permute(String str) {
        permuteHelper(str, "");
    }

    // Helper method to perform the permutation
    private void permuteHelper(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Generate permutations by removing the current character
                permuteHelper(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        PermutationSample ps = new PermutationSample();
        String input = "abc"; // Example input
        ps.permute(input);
    }
}
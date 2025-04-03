public class RussianDollEnvelopes {
    // Function to find the maximum number of envelopes that can be Russian dolled
    public int maxEnvelopes(int[][] envelopes) {
        // Sort envelopes by width and then by height in descending order
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // Sort by height in descending order
            }
            return a[0] - b[0]; // Sort by width in ascending order
        });

        // Extract the heights for the longest increasing subsequence
        int n = envelopes.length;
        int[] dp = new int[n];
        int length = 0;

        for (int[] envelope : envelopes) {
            int height = envelope[1];
            // Use binary search to find the insertion point
            int left = 0, right = length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (dp[mid] < height) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            dp[left] = height; // Update the dp array
            if (left == length) {
                length++; // Increase the length of the increasing subsequence
            }
        }

        return length; // The length of the longest increasing subsequence
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        RussianDollEnvelopes solution = new RussianDollEnvelopes();
        
        // Example input: envelopes represented as [width, height]
        int[][] envelopes = {{5, 4}, {6, 7}, {2, 3}, {1, 1}, {3, 4}, {5, 5}};
        
        // Calculate the maximum number of envelopes
        int result = solution.maxEnvelopes(envelopes);
        
        // Output the result
        System.out.println("Maximum number of envelopes that can be Russian dolled: " + result);
    }
}
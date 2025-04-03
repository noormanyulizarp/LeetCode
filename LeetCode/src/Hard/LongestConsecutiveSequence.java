public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(nums));
    }

    // Function to find the length of the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        // Use a HashSet to store the numbers for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through the numbers
        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the length of the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

/*
Example Output:
Longest consecutive sequence length: 4
Explanation:
The longest consecutive elements sequence is [1, 2, 3, 4]. 
Therefore, its length is 4.
*/
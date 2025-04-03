public class PartitionEqualSubsetSum {
    // Function to check if a given set can be partitioned into two subsets
    // such that the sum of elements in both subsets is the same.
    public static boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum is odd, we cannot partition it into two equal subsets
        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: a sum of 0 can always be achieved

        // Update the dp array for each number in the input array
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean result = canPartition(nums);
        System.out.println("Can the array " + java.util.Arrays.toString(nums) + " be partitioned into two subsets with equal sum? " + result);
    }
}

/*
Example Output:
Can the array [1, 5, 11, 5] be partitioned into two subsets with equal sum? true
*/
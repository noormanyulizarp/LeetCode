public class SplitArrayLargestSum {
    // Function to split the array into m subarrays such that the largest sum among them is minimized
    public static int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        // Calculate the sum of the array and the maximum element
        for (int num : nums) {
            left = Math.max(left, num); // Maximum single element
            right += num; // Total sum of the array
        }

        // Binary search for the minimum largest sum
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, mid, m)) {
                right = mid; // Try for a smaller maximum sum
            } else {
                left = mid + 1; // Increase the maximum sum
            }
        }
        return left; // The minimum largest sum
    }

    // Helper function to check if we can split the array into m subarrays with max sum <= maxSum
    private static boolean canSplit(int[] nums, int maxSum, int m) {
        int count = 1; // Start with one subarray
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                count++; // Need a new subarray
                currentSum = num; // Start new subarray with current number
                if (count > m) {
                    return false; // More than m subarrays needed
                }
            }
        }
        return true; // Can split into m or fewer subarrays
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        int result = splitArray(nums, m);
        System.out.println("The minimum largest sum is: " + result);
    }
}

/*
Example Output:
The minimum largest sum is: 18

Explanation:
The array [7, 2, 5, 10, 8] can be split into two subarrays [7, 2, 5] and [10, 8].
The sum of the first subarray is 14 and the sum of the second subarray is 18.
The largest sum among these two is 18, which is the minimum largest sum possible for 2 subarrays.
*/
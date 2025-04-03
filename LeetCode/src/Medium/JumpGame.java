public class JumpGame {
    // Function to determine if you can reach the last index of the array
    public static boolean canJump(int[] nums) {
        int maxReach = 0; // The maximum index we can reach
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the maximum reachable index, return false
            if (i > maxReach) {
                return false;
            }
            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
            // If we can reach the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return false; // If we exit the loop, we cannot reach the last index
    }

    public static void main(String[] args) {
        // Example test cases
        int[] test1 = {2, 3, 1, 1, 4}; // Expected output: true
        int[] test2 = {3, 2, 1, 0, 4}; // Expected output: false

        System.out.println("Can jump (test1): " + canJump(test1)); // Output: true
        System.out.println("Can jump (test2): " + canJump(test2)); // Output: false
    }
}
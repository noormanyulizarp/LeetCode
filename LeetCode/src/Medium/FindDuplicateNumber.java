public class FindDuplicateNumber {
    /**
     * This method finds the duplicate number in an array containing n + 1 integers
     * where each integer is between 1 and n (inclusive). It uses Floyd's Tortoise
     * and Hare (Cycle Detection) algorithm to find the duplicate.
     *
     * @param nums an array of integers
     * @return the duplicate number
     */
    public int findDuplicate(int[] nums) {
        // Step 1: Initialize the tortoise and hare
        int tortoise = nums[0];
        int hare = nums[0];

        // Step 2: Move tortoise by 1 step and hare by 2 steps
        do {
            tortoise = nums[tortoise]; // move tortoise by 1 step
            hare = nums[nums[hare]];    // move hare by 2 steps
        } while (tortoise != hare);    // loop until they meet

        // Step 3: Find the entrance to the cycle
        tortoise = nums[0]; // reset tortoise to the start
        while (tortoise != hare) {
            tortoise = nums[tortoise]; // move tortoise by 1 step
            hare = nums[hare];          // move hare by 1 step
        }

        // The point where they meet is the duplicate number
        return hare;
    }

    public static void main(String[] args) {
        FindDuplicateNumber finder = new FindDuplicateNumber();
        
        // Example input
        int[] nums = {1, 3, 4, 2, 2};
        
        // Finding the duplicate number
        int duplicate = finder.findDuplicate(nums);
        
        // Output the result
        System.out.println("The duplicate number is: " + duplicate);
    }
} 

// Example output:
// The duplicate number is: 2

// Explanation:
// In the example above, the input array is [1, 3, 4, 2, 2].
// The number 2 appears twice, hence it is the duplicate number found by the algorithm.
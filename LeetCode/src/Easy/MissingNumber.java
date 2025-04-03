public class MissingNumber {
    /**
     * This method finds the missing number in a given array of integers.
     * The array contains n distinct numbers taken from 0, 1, 2, ..., n.
     * 
     * @param nums an array of integers
     * @return the missing number
     */
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num; // Calculate the sum of the array elements
        }

        return expectedSum - actualSum; // The difference is the missing number
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 0, 1}; // The missing number is 2
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber); // Output: The missing number is: 2
    }
}
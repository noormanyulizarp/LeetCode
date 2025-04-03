public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);
        
        System.out.println("New length of the array: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    /**
     * This method removes duplicates from a sorted array in-place.
     * 
     * @param nums the input array of integers
     * @return the new length of the array after duplicates have been removed
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Check if current element is different from the previous
                nums[uniqueIndex] = nums[i]; // Update the unique index with the current element
                uniqueIndex++; // Move to the next unique index
            }
        }
        return uniqueIndex; // Return the length of the array without duplicates
    }
}
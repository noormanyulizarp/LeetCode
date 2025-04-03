public class RemoveDuplicatesFromSortedArray {
    /**
     * This method removes duplicates from a sorted array in-place.
     * It returns the new length of the array after removing duplicates.
     *
     * @param nums the sorted array from which duplicates are to be removed
     * @return the length of the array after duplicates have been removed
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // No elements to process
        }

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = nums[i]; // Update the unique position
                uniqueIndex++; // Move to the next unique position
            }
        }

        return uniqueIndex; // Return the length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);

        // Print the result
        System.out.println("New length of the array: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
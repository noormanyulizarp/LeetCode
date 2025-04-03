// SearchInsertPosition.java
// This class provides a solution to the "Search Insert Position" problem.
// Given a sorted array of distinct integers and a target value, 
// return the index if the target is found. If not, return the index 
// where it would be if it were inserted in order.

public class SearchInsertPosition {
    
    // Method to search for the insert position of a target in a sorted array
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (nums[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // If target is not found, left is the insert position
        return left;
    }

    // Main method to test the searchInsert function
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Insert position for target " + target + ": " + searchInsert(nums, target)); // Output: 2

        target = 2;
        System.out.println("Insert position for target " + target + ": " + searchInsert(nums, target)); // Output: 1

        target = 7;
        System.out.println("Insert position for target " + target + ": " + searchInsert(nums, target)); // Output: 4

        target = 0;
        System.out.println("Insert position for target " + target + ": " + searchInsert(nums, target)); // Output: 0
    }
}
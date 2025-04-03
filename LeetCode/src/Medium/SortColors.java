public class SortColors {
    // This method sorts an array containing 0s, 1s, and 2s in a single pass.
    // It uses the Dutch National Flag algorithm to achieve this.
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        // Iterate through the array
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], increment both low and mid
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If the element is 1, just move the mid pointer
                mid++;
            } else {
                // If the element is 2, swap nums[mid] and nums[high], decrement high
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Helper method to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test the sortColors function
    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] colors = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: ");
        for (int color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        sorter.sortColors(colors);

        System.out.println("After sorting: ");
        for (int color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}
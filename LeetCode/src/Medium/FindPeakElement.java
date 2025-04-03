public class FindPeakElement {
    // This method finds a peak element in the given array.
    // A peak element is an element that is greater than or equal to its neighbors.
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        
        // Check if the first element is a peak
        if (n == 1 || nums[0] > nums[1]) {
            return 0;
        }
        
        // Check if the last element is a peak
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        
        // Check for peak elements in the middle of the array
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        
        // If no peak is found, return -1 (this should not happen with valid input)
        return -1;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3, 1};
        
        // Finding the peak element
        int peakIndex = findPeakElement(nums);
        
        // Output the result
        System.out.println("Peak element is at index: " + peakIndex + " with value: " + nums[peakIndex]);
    }
}
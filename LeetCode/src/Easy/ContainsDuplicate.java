public class ContainsDuplicate {
    // This method checks if there are any duplicates in the given array of integers.
    public static boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        Set<Integer> seen = new HashSet<>();
        
        // Iterate through each number in the array
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            // Otherwise, add the number to the set
            seen.add(num);
        }
        // If we finish the loop without finding duplicates, return false
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        // Example input
        int[] nums1 = {1, 2, 3, 1}; // Contains duplicate
        int[] nums2 = {1, 2, 3, 4}; // No duplicates

        // Test the containsDuplicate method and print results
        System.out.println("Contains Duplicate (nums1): " + containsDuplicate(nums1)); // Expected output: true
        System.out.println("Contains Duplicate (nums2): " + containsDuplicate(nums2)); // Expected output: false
    }
}
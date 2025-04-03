// IntersectionOfTwoArrays.java
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    // This method finds the intersection of two integer arrays.
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : nums1) {
            set1.add(num);
        }

        // Check if elements of the second array are in the set
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the set to an array
        return intersection.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        // Example input arrays
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        // Find the intersection
        int[] result = intersect(nums1, nums2);

        // Print the result
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: Intersection: 2
    }
}
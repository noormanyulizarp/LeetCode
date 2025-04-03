public class MedianOfTwoSortedArrays {
    /**
     * This method finds the median of two sorted arrays.
     * 
     * @param nums1 the first sorted array
     * @param nums2 the second sorted array
     * @return the median of the two sorted arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int midIndex = totalLength / 2;
        boolean isEven = totalLength % 2 == 0;

        int[] merged = new int[midIndex + 1];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length && k <= midIndex) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < nums1.length && k <= midIndex) {
            merged[k++] = nums1[i++];
        }

        while (j < nums2.length && k <= midIndex) {
            merged[k++] = nums2[j++];
        }

        if (isEven) {
            return (merged[midIndex - 1] + merged[midIndex]) / 2.0;
        } else {
            return merged[midIndex];
        }
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays medianFinder = new MedianOfTwoSortedArrays();

        // Example 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + medianFinder.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        // Example 2
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + medianFinder.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }
}
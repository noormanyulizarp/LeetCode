public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array: ");
        printArray(nums);
        
        moveZeroes(nums);
        
        System.out.println("Array after moving zeroes: ");
        printArray(nums);
    }

    // Function to move all zeroes to the end of the array
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; // Pointer for the last non-zero element

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // Fill remaining positions with zeroes
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Helper method to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
} 

/*
Example Output:
Original array: 
0 1 0 3 12 
Array after moving zeroes: 
1 3 12 0 0 
*/ 

/*
This program defines a method to move all zeroes in an array to the end while maintaining the order of non-zero elements. 
It uses two passes: one to move non-zero elements and another to fill the rest of the array with zeroes.
*/
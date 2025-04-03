public class PowerOfTwo {
    // This method checks if a given number is a power of two.
    public static boolean isPowerOfTwo(int n) {
        // A number is a power of two if it is greater than 0 and
        // the bitwise AND of the number and its predecessor is 0.
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases to validate the isPowerOfTwo method
        int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 18, 32, 64, 100};

        for (int number : testNumbers) {
            System.out.println(number + " is power of two: " + isPowerOfTwo(number));
        }
    }
}

/*
Example Output:
1 is power of two: true
2 is power of two: true
3 is power of two: false
4 is power of two: true
5 is power of two: false
8 is power of two: true
16 is power of two: true
18 is power of two: false
32 is power of two: true
64 is power of two: true
100 is power of two: false
*/
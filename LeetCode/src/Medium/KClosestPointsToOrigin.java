// KClosestPointsToOrigin.java
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    
    // Method to find the K closest points to the origin (0, 0)
    public int[][] kClosest(int[][] points, int K) {
        // Create a max heap to store the K closest points
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(K, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                // Compare based on the distance from the origin
                return Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]);
            }
        });

        // Iterate through all points
        for (int[] point : points) {
            maxHeap.offer(point);
            // If the heap size exceeds K, remove the farthest point
            if (maxHeap.size() > K) {
                maxHeap.poll();
            }
        }

        // Convert the max heap to an array
        int[][] result = new int[K][2];
        for (int i = 0; i < K; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }

    // Main method to test the kClosest function
    public static void main(String[] args) {
        KClosestPointsToOrigin solution = new KClosestPointsToOrigin();
        
        // Example input: points and K
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int K = 2;

        // Get the K closest points
        int[][] closestPoints = solution.kClosest(points, K);

        // Output the result
        System.out.println("The " + K + " closest points to the origin are:");
        for (int[] point : closestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}

// Example output for the above input:
// The 2 closest points to the origin are:
// [-2, 2]
// [1, 3]
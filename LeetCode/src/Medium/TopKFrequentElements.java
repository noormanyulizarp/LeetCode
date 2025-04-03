// TopKFrequentElements.java
import java.util.*;

public class TopKFrequentElements {
    // This method returns the k most frequent elements from the input array.
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Create a frequency map to count occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a priority queue (min-heap) to store the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        // Add the frequency map entries to the min-heap
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            // If the heap size exceeds k, remove the smallest frequency element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Extract the keys (numbers) from the heap into a list
        List<Integer> topKElements = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topKElements.add(minHeap.poll().getKey());
        }

        return topKElements;
    }

    // Main method to test the topKFrequent method
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + result);
    }
}

// Example output for the above input:
// Top 2 frequent elements: [1, 2]
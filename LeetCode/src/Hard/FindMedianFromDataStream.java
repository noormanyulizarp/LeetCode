public class FindMedianFromDataStream {
    // This class maintains a data stream and allows finding the median of the numbers added to the stream.

    // Two heaps: a max-heap for the lower half and a min-heap for the upper half
    private PriorityQueue<Integer> lowerHalf; // max-heap
    private PriorityQueue<Integer> upperHalf; // min-heap

    public FindMedianFromDataStream() {
        // Initialize the two heaps
        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        upperHalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add the new number to the max-heap (lower half)
        lowerHalf.offer(num);
        
        // Ensure the largest number in the lower half is less than or equal to the smallest in the upper half
        if (!upperHalf.isEmpty() && lowerHalf.peek() > upperHalf.peek()) {
            upperHalf.offer(lowerHalf.poll());
        }

        // Balance the sizes of the two heaps
        if (lowerHalf.size() > upperHalf.size() + 1) {
            upperHalf.offer(lowerHalf.poll());
        } else if (upperHalf.size() > lowerHalf.size()) {
            lowerHalf.offer(upperHalf.poll());
        }
    }

    public double findMedian() {
        // If the sizes of the heaps are equal, return the average of the two middle values
        if (lowerHalf.size() == upperHalf.size()) {
            return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
        } else {
            // If the lower half has one more element, return the top of the max-heap
            return lowerHalf.peek();
        }
    }

    public static void main(String[] args) {
        FindMedianFromDataStream medianFinder = new FindMedianFromDataStream();
        
        // Example usage
        medianFinder.addNum(1);
        System.out.println("Median after adding 1: " + medianFinder.findMedian()); // Output: 1.0
        
        medianFinder.addNum(2);
        System.out.println("Median after adding 2: " + medianFinder.findMedian()); // Output: 1.5
        
        medianFinder.addNum(3);
        System.out.println("Median after adding 3: " + medianFinder.findMedian()); // Output: 2.0
        
        medianFinder.addNum(4);
        System.out.println("Median after adding 4: " + medianFinder.findMedian()); // Output: 2.5
    }
}
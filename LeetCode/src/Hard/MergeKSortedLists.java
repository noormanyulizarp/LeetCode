public class MergeKSortedLists {
    
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Use a priority queue (min-heap) to keep track of the smallest node
        java.util.PriorityQueue<ListNode> minHeap = new java.util.PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Add the head of each list to the min-heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Create a dummy node to help with the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // While there are nodes in the min-heap
        while (!minHeap.isEmpty()) {
            // Get the smallest node
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode; // Add it to the result list
            current = current.next; // Move to the next position

            // If there is a next node, add it to the min-heap
            if (smallestNode.next != null) {
                minHeap.offer(smallestNode.next);
            }
        }

        return dummy.next; // Return the merged list, which starts from the next of dummy
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        // Create sample linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};

        // Merge the k sorted lists
        ListNode mergedList = mergeKLists(lists);

        // Print the merged list
        printList(mergedList);
    }
} 

/*
Example Output:
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null
*/
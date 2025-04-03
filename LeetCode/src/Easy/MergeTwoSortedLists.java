public class MergeTwoSortedLists {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to help with the merging process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // While both lists have nodes to compare
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1; // Link the smaller node
                l1 = l1.next; // Move to the next node in l1
            } else {
                current.next = l2; // Link the smaller node
                l2 = l2.next; // Move to the next node in l2
            }
            current = current.next; // Move to the next position in the merged list
        }

        // If there are remaining nodes in either list, append them
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // The merged list is next to the dummy node
        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergedList = mergeTwoLists(l1, l2);
        System.out.print("Merged List: ");
        printList(mergedList); // Output: 1 1 2 3 4 4
    }
}
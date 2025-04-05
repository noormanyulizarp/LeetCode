// LinkedListExample2.java
// This class demonstrates a basic implementation of a singly linked list without using constructors.

/**
 * This Java class demonstrates a basic implementation of a singly linked list.
 * It includes methods to insert, display, and delete nodes in the list.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>The `insert` method adds a new node at the end of the list.</li>
 *   <li>The `display` method prints all elements of the list.</li>
 *   <li>The `delete` method removes a node by its value.</li>
 * </ul>
 *
 * <p>Use cases for linked lists:
 * <ul>
 *   <li>Dynamic memory allocation where the size of the list can change at runtime.</li>
 *   <li>Efficient insertion and deletion operations compared to arrays.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: Insert 5, 15, 25, 35; Delete 15
 * Output: Linked List: 5 -> 15 -> 25 -> 35 -> null
 *         After deleting 15: 5 -> 25 -> 35 -> null
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan implementasi dasar dari linked list tunggal.
// Kelas ini mencakup metode untuk menambahkan, menampilkan, dan menghapus node dalam daftar.
//
// <p>Detail program:
// <ul>
//   <li>Metode `insert` menambahkan node baru di akhir daftar.</li>
//   <li>Metode `display` mencetak semua elemen dalam daftar.</li>
//   <li>Metode `delete` menghapus node berdasarkan nilainya.</li>
// </ul>
//
// <p>Penggunaan linked list:
// <ul>
//   <li>Pengalokasian memori dinamis di mana ukuran daftar dapat berubah saat runtime.</li>
//   <li>Operasi penambahan dan penghapusan yang lebih efisien dibandingkan array.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: Tambahkan 5, 15, 25, 35; Hapus 15
// Output: Linked List: 5 -> 15 -> 25 -> 35 -> null
//         Setelah menghapus 15: 5 -> 25 -> 35 -> null
// </pre>
public class LinkedListExample2 {
    static class Node {
        int data;
        Node next;
    }

    Node head; // Head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int value) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; // Bypass the node to delete
                return;
            }
            current = current.next;
        }
    }

    // Main method to demonstrate the linked list operations
    public static void main(String[] args) {
        LinkedListExample2 linkedList = new LinkedListExample2();

        // Inserting elements
        linkedList.insert(5);
        linkedList.insert(15);
        linkedList.insert(25);
        linkedList.insert(35);

        // Displaying the linked list
        System.out.println("Linked List:");
        linkedList.display(); // Output: 5 -> 15 -> 25 -> 35 -> null

        // Deleting a node
        linkedList.delete(15);
        System.out.println("After deleting 15:");
        linkedList.display(); // Output: 5 -> 25 -> 35 -> null
    }
}
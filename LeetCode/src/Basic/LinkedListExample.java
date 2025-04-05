// LinkedListExample.java
// This class demonstrates basic operations on a singly linked list in Java.

/**
 * This Java class demonstrates basic operations on a singly linked list.
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
 * Input: Insert 10, 20, 30, 40; Delete 20
 * Output: Linked List: 10 -> 20 -> 30 -> 40 -> null
 *         After deleting 20: 10 -> 30 -> 40 -> null
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan operasi dasar pada linked list tunggal.
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
// Input: Tambahkan 10, 20, 30, 40; Hapus 20
// Output: Linked List: 10 -> 20 -> 30 -> 40 -> null
//         Setelah menghapus 20: 10 -> 30 -> 40 -> null
// </pre>
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    Node head; // head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
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
        LinkedListExample linkedList = new LinkedListExample();

        // Inserting elements
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        // Displaying the linked list
        System.out.println("Linked List:");
        linkedList.display(); // Output: 10 -> 20 -> 30 -> 40 -> null

        // Deleting a node
        linkedList.delete(20);
        System.out.println("After deleting 20:");
        linkedList.display(); // Output: 10 -> 30 -> 40 -> null
    }
}
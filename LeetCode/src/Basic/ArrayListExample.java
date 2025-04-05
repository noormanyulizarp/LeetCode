// ArrayListExample.java
// This program demonstrates the use of ArrayList in Java.

/**
 * This Java class demonstrates the use of ArrayList, a resizable array implementation in Java.
 * It includes examples of adding, removing, and iterating through elements in an ArrayList.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>Elements are added to the ArrayList using the `add` method.</li>
 *   <li>Elements are removed using the `remove` method.</li>
 *   <li>The size of the ArrayList is retrieved using the `size` method.</li>
 * </ul>
 *
 * <p>Use cases for ArrayList:
 * <ul>
 *   <li>Dynamic arrays where the size can change at runtime.</li>
 *   <li>Storing and manipulating collections of objects.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: Add "Apple", "Banana", "Cherry", "Date"; Remove "Banana"
 * Output: Fruits in the list: [Apple, Banana, Cherry, Date]
 *         After removing Banana: [Apple, Cherry, Date]
 *         Iterating through the list:
 *         Apple
 *         Cherry
 *         Date
 *         Total number of fruits: 3
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan penggunaan ArrayList, implementasi array yang dapat diubah ukurannya di Java.
// Kelas ini mencakup contoh penambahan, penghapusan, dan iterasi elemen dalam ArrayList.
//
// <p>Detail program:
// <ul>
//   <li>Elemen ditambahkan ke ArrayList menggunakan metode `add`.</li>
//   <li>Elemen dihapus menggunakan metode `remove`.</li>
//   <li>Ukuran ArrayList diambil menggunakan metode `size`.</li>
// </ul>
//
// <p>Penggunaan ArrayList:
// <ul>
//   <li>Array dinamis di mana ukurannya dapat berubah saat runtime.</li>
//   <li>Menyimpan dan memanipulasi koleksi objek.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: Tambahkan "Apple", "Banana", "Cherry", "Date"; Hapus "Banana"
// Output: Buah dalam daftar: [Apple, Banana, Cherry, Date]
//         Setelah menghapus Banana: [Apple, Cherry, Date]
//         Iterasi melalui daftar:
//         Apple
//         Cherry
//         Date
//         Total jumlah buah: 3
// </pre>
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Display the ArrayList
        System.out.println("Fruits in the list: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the ArrayList
        System.out.println("Total number of fruits: " + fruits.size());
    }
}

// Example output:
// Fruits in the list: [Apple, Banana, Cherry, Date]
// After removing Banana: [Apple, Cherry, Date]
// Iterating through the list:
// Apple
// Cherry
// Date
// Total number of fruits: 3
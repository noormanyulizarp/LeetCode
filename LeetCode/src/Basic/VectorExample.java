// VectorExample.java
// This program demonstrates the use of Vector in Java.

/**
 * This Java class demonstrates the use of Vector, a synchronized collection in Java.
 * It includes examples of adding, removing, and iterating through elements in a Vector.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>Elements are added to the Vector using the `add` method.</li>
 *   <li>Elements are removed using the `remove` method.</li>
 *   <li>The size of the Vector is retrieved using the `size` method.</li>
 * </ul>
 *
 * <p>Use cases for Vector:
 * <ul>
 *   <li>Thread-safe collections in multithreaded environments.</li>
 *   <li>Storing and manipulating collections of objects.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: Add "New York", "London", "Tokyo", "Paris"; Remove "London"
 * Output: Cities in the vector: [New York, London, Tokyo, Paris]
 *         After removing London: [New York, Tokyo, Paris]
 *         Iterating through the vector:
 *         New York
 *         Tokyo
 *         Paris
 *         Total number of cities: 3
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan penggunaan Vector, koleksi yang disinkronkan di Java.
// Kelas ini mencakup contoh penambahan, penghapusan, dan iterasi elemen dalam Vector.
//
// <p>Detail program:
// <ul>
//   <li>Elemen ditambahkan ke Vector menggunakan metode `add`.</li>
//   <li>Elemen dihapus menggunakan metode `remove`.</li>
//   <li>Ukuran Vector diambil menggunakan metode `size`.</li>
// </ul>
//
// <p>Penggunaan Vector:
// <ul>
//   <li>Koleksi thread-safe dalam lingkungan multithread.</li>
//   <li>Menyimpan dan memanipulasi koleksi objek.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: Tambahkan "New York", "London", "Tokyo", "Paris"; Hapus "London"
// Output: Kota dalam vector: [New York, London, Tokyo, Paris]
//         Setelah menghapus London: [New York, Tokyo, Paris]
//         Iterasi melalui vector:
//         New York
//         Tokyo
//         Paris
//         Total jumlah kota: 3
// </pre>
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to hold String elements
        Vector<String> cities = new Vector<>();

        // Adding elements to the Vector
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");

        // Display the Vector
        System.out.println("Cities in the vector: " + cities);

        // Remove an element from the Vector
        cities.remove("London");
        System.out.println("After removing London: " + cities);

        // Iterate through the Vector
        System.out.println("Iterating through the vector:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Get the size of the Vector
        System.out.println("Total number of cities: " + cities.size());
    }
}

// Example output:
// Cities in the vector: [New York, London, Tokyo, Paris]
// After removing London: [New York, Tokyo, Paris]
// Iterating through the vector:
// New York
// Tokyo
// Paris
// Total number of cities: 3
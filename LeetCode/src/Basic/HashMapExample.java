// HashMapExample.java
// This example demonstrates the usage of HashMap in Java.

/**
 * This Java class demonstrates the usage of HashMap, a key-value pair collection in Java.
 * It includes examples of adding, accessing, removing, and iterating through key-value pairs.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>Key-value pairs are added using the `put` method.</li>
 *   <li>Values are accessed using the `get` method.</li>
 *   <li>Keys are checked using the `containsKey` method.</li>
 *   <li>Key-value pairs are removed using the `remove` method.</li>
 * </ul>
 *
 * <p>Use cases for HashMap:
 * <ul>
 *   <li>Storing and retrieving data using unique keys.</li>
 *   <li>Efficient lookups and updates in constant time on average.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: Add {"Apple": 1, "Banana": 2, "Orange": 3, "Grapes": 4}; Remove "Grapes"
 * Output: HashMap: {Apple=1, Banana=2, Orange=3, Grapes=4}
 *         Count of Apples: 1
 *         Banana is present in the map.
 *         HashMap after removing Grapes: {Apple=1, Banana=2, Orange=3}
 *         Iterating over HashMap:
 *         Apple: 1
 *         Banana: 2
 *         Orange: 3
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan penggunaan HashMap, koleksi pasangan kunci-nilai di Java.
// Kelas ini mencakup contoh penambahan, akses, penghapusan, dan iterasi pasangan kunci-nilai.
//
// <p>Detail program:
// <ul>
//   <li>Pemakaian pasangan kunci-nilai menggunakan metode `put`.</li>
//   <li>Nilai diakses menggunakan metode `get`.</li>
//   <li>Kunci diperiksa menggunakan metode `containsKey`.</li>
//   <li>Pemakaian pasangan kunci-nilai dihapus menggunakan metode `remove`.</li>
// </ul>
//
// <p>Penggunaan HashMap:
// <ul>
//   <li>Menyimpan dan mengambil data menggunakan kunci unik.</li>
//   <li>Pencarian dan pembaruan yang efisien dalam waktu konstan rata-rata.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: Tambahkan {"Apple": 1, "Banana": 2, "Orange": 3, "Grapes": 4}; Hapus "Grapes"
// Output: HashMap: {Apple=1, Banana=2, Orange=3, Grapes=4}
//         Jumlah Apel: 1
//         Pisang ada di dalam peta.
//         HashMap setelah menghapus Grapes: {Apple=1, Banana=2, Orange=3}
//         Iterasi melalui HashMap:
//         Apple: 1
//         Banana: 2
//         Orange: 3
// </pre>
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grapes", 4);

        // Displaying the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value using its key
        int appleCount = map.get("Apple");
        System.out.println("Count of Apples: " + appleCount);

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present in the map.");
        }

        // Removing a key-value pair
        map.remove("Grapes");
        System.out.println("HashMap after removing Grapes: " + map);

        // Iterating over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

// Example Output:
// HashMap: {Apple=1, Banana=2, Orange=3, Grapes=4}
// Count of Apples: 1
// Banana is present in the map.
// HashMap after removing Grapes: {Apple=1, Banana=2, Orange=3}
// Iterating over HashMap:
// Apple: 1
// Banana: 2
// Orange: 3
// ThreadingExample.java
// This program demonstrates the use of ArrayList and Vector in a multithreaded environment.

/**
 * This Java class demonstrates the use of ArrayList and Vector in a multithreaded environment.
 * It highlights the thread-safety issues of ArrayList and the thread-safe nature of Vector.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>Two threads add elements to an ArrayList, which is not thread-safe.</li>
 *   <li>Two threads add elements to a Vector, which is thread-safe.</li>
 *   <li>The sizes of both collections are displayed after all threads finish execution.</li>
 * </ul>
 *
 * <p>Use cases for thread-safe collections:
 * <ul>
 *   <li>Ensuring data consistency in multithreaded applications.</li>
 *   <li>Preventing race conditions when multiple threads access shared resources.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Output:
 * Size of ArrayList: <less than 2000, due to race conditions>
 * Size of Vector: 2000
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan penggunaan ArrayList dan Vector dalam lingkungan multithread.
// Program ini menyoroti masalah thread-safety pada ArrayList dan sifat thread-safe dari Vector.
//
// <p>Detail program:
// <ul>
//   <li>Dua thread menambahkan elemen ke ArrayList, yang tidak thread-safe.</li>
//   <li>Dua thread menambahkan elemen ke Vector, yang thread-safe.</li>
//   <li>Ukuran kedua koleksi ditampilkan setelah semua thread selesai dieksekusi.</li>
// </ul>
//
// <p>Penggunaan koleksi thread-safe:
// <ul>
//   <li>Memastikan konsistensi data dalam aplikasi multithread.</li>
//   <li>Mencegah race condition ketika beberapa thread mengakses sumber daya bersama.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Output:
// Ukuran ArrayList: <kurang dari 2000, karena race condition>
// Ukuran Vector: 2000
// </pre>
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        // Create an ArrayList and a Vector
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        // Create two threads to add 1000 items to the ArrayList
        Thread arrayListThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                arrayList.add(i);
            }
        });

        Thread arrayListThread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                arrayList.add(i);
            }
        });

        // Create two threads to add 1000 items to the Vector
        Thread vectorThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread vectorThread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                vector.add(i);
            }
        });

        // Start all threads
        arrayListThread1.start();
        arrayListThread2.start();
        vectorThread1.start();
        vectorThread2.start();

        // Wait for all threads to finish
        arrayListThread1.join();
        arrayListThread2.join();
        vectorThread1.join();
        vectorThread2.join();

        // Display the sizes of the lists
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of Vector: " + vector.size());
    }
}

// Example output (ArrayList size may vary due to thread-safety issues):
// Size of ArrayList: <less than 2000, due to race conditions>
// Size of Vector: 2000
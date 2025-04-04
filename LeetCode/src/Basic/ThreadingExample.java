// ThreadingExample.java
// This program demonstrates the use of ArrayList and Vector in a multithreaded environment.

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
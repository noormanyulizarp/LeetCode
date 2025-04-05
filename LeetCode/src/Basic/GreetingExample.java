// GreetingExample.java
// This program demonstrates a simple greeting message in Java.

/**
 * This Java class demonstrates a simple greeting message. It contains a method
 * to display a predefined greeting message to the user.
 *
 * <p>Details of the greeting program:
 * <ul>
 *   <li>The program defines a method called `displayGreeting` to print a greeting message.</li>
 *   <li>The `main` method calls this method to display the message.</li>
 * </ul>
 *
 * <p>Use cases for greeting programs:
 * <ul>
 *   <li>Providing a friendly introduction to users in software applications.</li>
 *   <li>Demonstrating basic programming concepts, such as methods and printing output.</li>
 *   <li>Serving as a starting point for more complex programs.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Output: Hello, welcome to the Java programming world!
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan pesan sapaan sederhana. Kelas ini berisi metode
// untuk menampilkan pesan sapaan yang telah ditentukan kepada pengguna.
//
// <p>Detail program sapaan:
// <ul>
//   <li>Program mendefinisikan metode bernama `displayGreeting` untuk mencetak pesan sapaan.</li>
//   <li>Metode `main` memanggil metode ini untuk menampilkan pesan.</li>
// </ul>
//
// <p>Penggunaan program sapaan:
// <ul>
//   <li>Menyediakan pengantar yang ramah kepada pengguna dalam aplikasi perangkat lunak.</li>
//   <li>Menunjukkan konsep dasar pemrograman, seperti metode dan mencetak output.</li>
//   <li>Berfungsi sebagai titik awal untuk program yang lebih kompleks.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Output: Hello, welcome to the Java programming world!
// </pre>
public class GreetingExample {
    public static void main(String[] args) {
        // Call the method to display the greeting
        displayGreeting();
    }

    // Method to display a greeting message
    public static void displayGreeting() {
        String greeting = "Hello, welcome to the Java programming world!";
        System.out.println(greeting);
    }
}

// Example Output:
// Hello, welcome to the Java programming world!
// ArithmeticOperationsExample.java
// This program demonstrates basic arithmetic operations in Java.

/**
 * This Java class demonstrates basic arithmetic operations such as addition,
 * subtraction, multiplication, division, and modulus. It provides methods to
 * perform these operations and displays the results.
 *
 * <p>Details of the program:
 * <ul>
 *   <li>The `add` method performs addition of two numbers.</li>
 *   <li>The `subtract` method performs subtraction of two numbers.</li>
 *   <li>The `multiply` method performs multiplication of two numbers.</li>
 *   <li>The `divide` method performs division of two numbers.</li>
 *   <li>The `modulus` method calculates the remainder of division.</li>
 * </ul>
 *
 * <p>Use cases for arithmetic operations:
 * <ul>
 *   <li>Performing mathematical calculations in software applications.</li>
 *   <li>Building calculators or solving mathematical problems programmatically.</li>
 *   <li>Understanding basic programming concepts such as methods and operators.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: num1 = 10, num2 = 5
 * Output:
 * Addition: 15
 * Subtraction: 5
 * Multiplication: 50
 * Division: 2
 * Modulus: 0
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menunjukkan operasi aritmatika dasar seperti penjumlahan,
// pengurangan, perkalian, pembagian, dan modulus. Kelas ini menyediakan metode
// untuk melakukan operasi tersebut dan menampilkan hasilnya.
//
// <p>Detail program:
// <ul>
//   <li>Metode `add` melakukan penjumlahan dua bilangan.</li>
//   <li>Metode `subtract` melakukan pengurangan dua bilangan.</li>
//   <li>Metode `multiply` melakukan perkalian dua bilangan.</li>
//   <li>Metode `divide` melakukan pembagian dua bilangan.</li>
//   <li>Metode `modulus` menghitung sisa pembagian.</li>
// </ul>
//
// <p>Penggunaan operasi aritmatika:
// <ul>
//   <li>Melakukan perhitungan matematika dalam aplikasi perangkat lunak.</li>
//   <li>Membangun kalkulator atau menyelesaikan masalah matematika secara programatik.</li>
//   <li>Memahami konsep dasar pemrograman seperti metode dan operator.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: num1 = 10, num2 = 5
// Output:
// Penjumlahan: 15
// Pengurangan: 5
// Perkalian: 50
// Pembagian: 2
// Modulus: 0
// </pre>
public class ArithmeticOperationsExample {
    // Method to perform addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to perform division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Method to calculate modulus
    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Perform arithmetic operations
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));
    }
}

/*
Example Output:
Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Modulus: 0
*/
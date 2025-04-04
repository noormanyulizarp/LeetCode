/**
 * This Java class calculates the Greatest Common Divisor (GCD) of two numbers
 * using the Euclidean algorithm and prints the result. The GCD is the largest
 * number that divides both numbers without leaving a remainder.
 *
 * <p>Details of the Euclidean algorithm:
 * <ul>
 *   <li>If the second number (b) is 0, the GCD is the first number (a).</li>
 *   <li>Otherwise, recursively calculate the GCD of b and the remainder of a divided by b (a % b).</li>
 * </ul>
 *
 * <p>Use cases for GCD:
 * <ul>
 *   <li>Finding the largest number that divides two numbers without a remainder.</li>
 *   <li>Simplifying fractions by dividing the numerator and denominator by their GCD.</li>
 *   <li>Determining if two numbers are relatively prime (GCD is 1).</li>
 *   <li>Applications in cryptography, such as the RSA algorithm.</li>
 *   <li>Various problems in number theory and mathematics.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: num1 = 56, num2 = 98
 * Output: The GCD of 56 and 98 is: 14
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menghitung Greatest Common Divisor (GCD) dari dua bilangan
// menggunakan algoritma Euclidean dan mencetak hasilnya. GCD adalah bilangan
// terbesar yang dapat membagi kedua bilangan tanpa meninggalkan sisa.
//
// <p>Detail algoritma Euclidean:
// <ul>
//   <li>Jika bilangan kedua (b) adalah 0, maka GCD adalah bilangan pertama (a).</li>
//   <li>Jika tidak, hitung GCD dari b dan sisa pembagian a dengan b (a % b) secara rekursif.</li>
// </ul>
//
// <p>Penggunaan GCD:
// <ul>
//   <li>Menemukan bilangan terbesar yang dapat membagi dua bilangan tanpa sisa.</li>
//   <li>Menyederhanakan pecahan dengan membagi pembilang dan penyebut dengan GCD-nya.</li>
//   <li>Menentukan apakah dua bilangan relatif prima (GCD-nya adalah 1).</li>
//   <li>Aplikasi dalam kriptografi, seperti algoritma RSA.</li>
//   <li>Berbagai masalah dalam teori bilangan dan matematika.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: num1 = 56, num2 = 98
// Output: GCD dari 56 dan 98 adalah: 14
// </pre>
public class GCDExample {
    // Method to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        // Ensure a is greater than b
        if (b == 0) {
            return a; // Base case: if b is 0, return a
        }
        return gcd(b, a % b); // Recursive call
    }

    public static void main(String[] args) {
        // Example inputs
        int num1 = 56;
        int num2 = 98;

        // Calculate GCD
        int result = gcd(num1, num2);

        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }
}

/*
Example Output:
The GCD of 56 and 98 is: 14
*/
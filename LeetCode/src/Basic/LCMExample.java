// LCMExample.java
// This program demonstrates the calculation of the Least Common Multiple (LCM) using the formula LCM(a, b) = (a * b) / GCD(a, b).

/**
 * This Java class calculates the Least Common Multiple (LCM) of two numbers
 * using the formula: LCM(a, b) = (a * b) / GCD(a, b). The LCM is the smallest
 * number that is a multiple of both numbers.
 *
 * <p>Details of the LCM calculation:
 * <ul>
 *   <li>First, calculate the Greatest Common Divisor (GCD) of the two numbers using the Euclidean algorithm.</li>
 *   <li>Then, use the formula: LCM(a, b) = (a * b) / GCD(a, b).</li>
 * </ul>
 *
 * <p>Use cases for LCM:
 * <ul>
 *   <li>Finding the smallest number that is divisible by two or more numbers.</li>
 *   <li>Applications in scheduling problems, such as finding the least time interval for recurring events.</li>
 *   <li>Solving problems in number theory and mathematics.</li>
 * </ul>
 *
 * <p>Example:
 * <pre>
 * Input: num1 = 12, num2 = 18
 * Output: The LCM of 12 and 18 is: 36
 * </pre>
 */
// Penjelasan dalam Bahasa Indonesia:
// Kelas Java ini menghitung Least Common Multiple (LCM) dari dua bilangan
// menggunakan rumus: LCM(a, b) = (a * b) / GCD(a, b). LCM adalah bilangan
// terkecil yang merupakan kelipatan dari kedua bilangan tersebut.
//
// <p>Detail perhitungan LCM:
// <ul>
//   <li>Pertama, hitung Greatest Common Divisor (GCD) dari kedua bilangan menggunakan algoritma Euclidean.</li>
//   <li>Kemudian, gunakan rumus: LCM(a, b) = (a * b) / GCD(a, b).</li>
// </ul>
//
// <p>Penggunaan LCM:
// <ul>
//   <li>Menemukan bilangan terkecil yang dapat dibagi oleh dua atau lebih bilangan.</li>
//   <li>Aplikasi dalam masalah penjadwalan, seperti menemukan interval waktu terkecil untuk kejadian berulang.</li>
//   <li>Menyelesaikan masalah dalam teori bilangan dan matematika.</li>
// </ul>
//
// <p>Contoh:
// <pre>
// Input: num1 = 12, num2 = 18
// Output: LCM dari 12 dan 18 adalah: 36
// </pre>
public class LCMExample {
    // Method to calculate the Least Common Multiple (LCM) of two numbers
    public static int calculateLCM(int a, int b) {
        // Calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
        int gcd = calculateGCD(a, b);
        // LCM is calculated using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / gcd;
    }

    // Helper method to calculate the GCD of two numbers
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example usage of the LCM calculation
        int num1 = 12;
        int num2 = 18;

        // Calculate LCM of num1 and num2
        int lcm = calculateLCM(num1, num2);

        // Output the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
} 

// Example output when running the program:
// The LCM of 12 and 18 is: 36
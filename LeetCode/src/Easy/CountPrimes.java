public class CountPrimes {
    // This method counts the number of prime numbers less than a given number n.
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0; // There are no prime numbers less than 2
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        // Implementing the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count; // Return the total count of prime numbers
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        int primeCount = countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + ": " + primeCount);
        // Expected output: Number of prime numbers less than 10: 4
    }
}
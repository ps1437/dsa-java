package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumber {

    boolean isPrime(int n) {

        if (n == 0 || n == 1) return false;

        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        int sqrt = (int) Math.sqrt(n);
        //O(sqrt(n)
        for (int i = 5; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    boolean isPrimeOptimal(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Test
    void primeNumberTest() {
        // Test prime numbers
        Assertions.assertTrue(isPrime(2)); // Smallest prime number
        Assertions.assertTrue(isPrime(3)); // Another small prime number
        Assertions.assertTrue(isPrime(7)); // A larger prime number
        Assertions.assertTrue(isPrime(11)); // A prime number
        Assertions.assertTrue(isPrime(13)); // A prime number
        Assertions.assertTrue(isPrime(17)); // A prime number

        // Test non-prime numbers
        Assertions.assertFalse(isPrime(1)); // 1 is not a prime number
        Assertions.assertFalse(isPrime(4)); // 4 is not a prime number
        Assertions.assertFalse(isPrime(8)); // 8 is not a prime number
        Assertions.assertFalse(isPrime(15)); // 15 is not a prime number
        Assertions.assertFalse(isPrime(20)); // 20 is not a prime number

        // Test prime numbers using isPrimeOptimal
        Assertions.assertTrue(isPrimeOptimal(2)); // Smallest prime number
        Assertions.assertTrue(isPrimeOptimal(3)); // Another small prime number
        Assertions.assertTrue(isPrimeOptimal(7)); // A larger prime number
        Assertions.assertTrue(isPrimeOptimal(11)); // A prime number
        Assertions.assertTrue(isPrimeOptimal(13)); // A prime number
        Assertions.assertTrue(isPrimeOptimal(17)); // A prime number

        // Test non-prime numbers using isPrimeOptimal
        Assertions.assertFalse(isPrimeOptimal(1)); // 1 is not a prime number
        Assertions.assertFalse(isPrimeOptimal(4)); // 4 is not a prime number
        Assertions.assertFalse(isPrimeOptimal(8)); // 8 is not a prime number
        Assertions.assertFalse(isPrimeOptimal(15)); // 15 is not a prime number
        Assertions.assertFalse(isPrimeOptimal(20)); // 20 is not a prime number
    }

}

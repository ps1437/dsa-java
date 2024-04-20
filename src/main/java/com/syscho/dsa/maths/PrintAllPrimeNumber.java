package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrintAllPrimeNumber {


    List<Integer> printPrimeFactor(int n) {
        List<Integer> primeNumbers = new LinkedList<>();
        if (n <= 1) {
            return Collections.emptyList();
        }


        while (n % 2 == 0) {
            primeNumbers.add(2);
            n = n / 2;
        }

        while (n % 3 == 0) {
            primeNumbers.add(3);
            n = n / 3;
        }

        //O(sqrt(n))
        for (int i = 5; i < Math.sqrt(n); i = i + 6) {

            while (n % i == 0) {
                primeNumbers.add(i);
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                primeNumbers.add(i + 2);
                n = n / (i + 2);
            }


        }

        if (n > 3) {
            primeNumbers.add(n);
        }

        return primeNumbers;
    }

    @Test
    void testPrintPrimeFactor() {

        // Test case 1: Prime factors of 12
        List<Integer> expected12 = Arrays.asList(2, 2, 3);
        List<Integer> primeFactors12 = printPrimeFactor(12);
        Assertions.assertEquals(expected12, primeFactors12, "Failed for 12");

        // Test case 2: Prime factors of 29
        List<Integer> expected29 = Arrays.asList(29);
        List<Integer> primeFactors29 = printPrimeFactor(29);
        Assertions.assertEquals(expected29, primeFactors29, "Failed for 29");

        // Test case 3: Prime factors of 1 (edge case)
        List<Integer> expected1 = Arrays.asList();
        List<Integer> primeFactors1 = printPrimeFactor(1);
        Assertions.assertEquals(expected1, primeFactors1, "Failed for 1");

        // Test case 4: Prime factors of a large number
        List<Integer> expectedLarge = Arrays.asList(2, 2, 2, 3, 5, 7);
        List<Integer> primeFactorsLarge = printPrimeFactor(840);
        Assertions.assertEquals(expectedLarge, primeFactorsLarge, "Failed for large number");

        // Negative test case: Prime factors of a negative number (should return empty list)
        List<Integer> primeFactorsNegative = printPrimeFactor(-100);
        Assertions.assertEquals(expected1, primeFactorsNegative, "Failed for negative number");

    }
}



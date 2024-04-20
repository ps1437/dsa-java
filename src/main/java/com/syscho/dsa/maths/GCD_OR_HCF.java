package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.IntBinaryOperator;

public class GCD_OR_HCF {
    public int gcd(int a, int b) {

        if (b == 0) {
            return a; // The GCD of a and 0 is a
        }

        return Math.abs(gcd(b, a % b)); // Math.abs to handle - value
    }


    public int gcdIterative(int a, int b) {

        a = Math.abs(a); // Handle negative values
        b = Math.abs(b); // Handle negative values


        while (b != 0) {
            int temp = b;
            b = (a % b);
            a = temp;
        }
        return a;

    }


    @Test
    void testGCD() {
        testGCDHelper(this::gcd);
        testGCDHelper(this::gcdIterative);
    }

    private void testGCDHelper(IntBinaryOperator gcdFunction) {
        // Test GCD of positive numbers
        Assertions.assertEquals(12, gcdFunction.applyAsInt(24, 36)); // GCD of 24 and 36 is 12
        Assertions.assertEquals(5, gcdFunction.applyAsInt(15, 25)); // GCD of 15 and 25 is 5
        Assertions.assertEquals(1, gcdFunction.applyAsInt(17, 23)); // GCD of 17 and 23 is 1
        Assertions.assertEquals(10, gcdFunction.applyAsInt(100, 110)); // GCD of 100 and 110 is 10

        // Test GCD of negative numbers
        Assertions.assertEquals(4, gcdFunction.applyAsInt(-12, -16)); // GCD of -12 and -16 is 4
        Assertions.assertEquals(1, gcdFunction.applyAsInt(-17, 23)); // GCD of -17 and 23 is 1
        Assertions.assertEquals(5, gcdFunction.applyAsInt(15, -25)); // GCD of 15 and -25 is 5

        // Test GCD with zero
        Assertions.assertEquals(24, gcdFunction.applyAsInt(0, 24)); // GCD of 0 and 24 is 24
        Assertions.assertEquals(36, gcdFunction.applyAsInt(36, 0)); // GCD of 36 and 0 is 36
        Assertions.assertEquals(0, gcdFunction.applyAsInt(0, 0)); // GCD of 0 and 0 is 0
    }


}

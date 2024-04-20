package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArmstrongNumbers {

    boolean armstrongNumbers(int n) {

        double sum = 0;
        int temp = n;

        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + Math.pow(rem, 3);
            temp /= 10;
        }
        return (int) sum == n;

    }

    @Test
    void armstrongNumbersTest() {
        Assertions.assertTrue(armstrongNumbers(153));
        Assertions.assertFalse(armstrongNumbers(54));
    }
}

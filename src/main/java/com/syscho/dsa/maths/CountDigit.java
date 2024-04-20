package com.syscho.dsa.maths;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDigit {

    private int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    private int countDigitLogFunction(int n) {
        if (n == 0) {
            return 1;
        }

        return (int) Math.floor(Math.log10(Math.abs(n)) + 1);
    }

    @Test
    void countDigitTest() {
        Assertions.assertEquals(3, countDigit(133));
        Assertions.assertEquals(1, countDigit(1));
        Assertions.assertEquals(6, countDigit(123456));

        Assertions.assertEquals(3, countDigitLogFunction(133));
        Assertions.assertEquals(1, countDigitLogFunction(1));
        Assertions.assertEquals(6, countDigitLogFunction(123456));
    }


}

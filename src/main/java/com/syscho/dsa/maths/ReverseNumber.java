package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseNumber {

    private int reverseNumber(int n) {

        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }


    @Test
    void reverseNumberTest() {
        Assertions.assertEquals(321, reverseNumber(123));
        Assertions.assertEquals(654321, reverseNumber(123456));
    }


}

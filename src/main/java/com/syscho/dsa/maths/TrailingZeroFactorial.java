package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrailingZeroFactorial {

    private int trailingZeroFactorial(int n) {

        int res = 0;

        for (int i = 5; i <= n; i = i * 5) {
            int i1 = n / i;
            System.out.println("----" + i1);
            res = res + i1;
        }

        return res;
    }


    @Test
    void trailingZeroFactorialTest() {
        // 5 = 120 => 1 zero
        Assertions.assertEquals(1, trailingZeroFactorial(5));

    }


}

package com.syscho.dsa.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial {

    private int factorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    @Test
    void factorialTest() {
        // 5 = 120 => 1 zero
        Assertions.assertEquals(120, factorial(5));
        Assertions.assertEquals(720, factorial(6));

    }


}

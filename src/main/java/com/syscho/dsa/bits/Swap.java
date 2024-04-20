package com.syscho.dsa.bits;

public class Swap {

    public static void main(String[] args) {


        int a = 3, b = 5;
        System.out.println("a:" + a + " b:" + b);
        a = a ^ b; //(1)
        b = a ^ b; // (a^b) form (1) ^b  -> a  where (b^b cancelled)
        a = a ^ b; //(a^b)from (2) ^a -> b from (2)
        System.out.println("a:" + a + " b:" + b);
    }
}
